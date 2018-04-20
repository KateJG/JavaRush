package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("Surname" + i, "Name" + i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            int freq = Collections.frequency(map.values(), pair.getValue());
            if (freq > 1) list.add(pair.getValue());
        }

        for (int i = 0; i < list.size(); i++) {
            removeItemFromMapByValue(map, list.get(i));
        }
    }

        public static void removeItemFromMapByValue (HashMap < String, String > map, String value){
            HashMap<String, String> copy = new HashMap<String, String>(map);
            for (Map.Entry<String, String> pair : copy.entrySet()) {
                if (pair.getValue().equals(value))
                    map.remove(pair.getKey());
            }

        }

        public static void main (String[]args){

        }
    }


