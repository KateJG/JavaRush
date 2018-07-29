package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i =0; i < 10; i++) {
            map.put("name" + i, "lastName" + i);
        }
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int tmp = 0;
        for(String s : map.values()) {
            if (s.equals(name)) {
                tmp++;
            }
        }
        return tmp;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код

        int tmp = 0;
        for(String s: map.keySet()) {
            if (s.equals(lastName)) {
                tmp ++;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(createMap());

    }
}
