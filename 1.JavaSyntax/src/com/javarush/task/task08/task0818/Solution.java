package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < 10; i++) {
            map.put("Surname" + i, 500 * i);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        map.entrySet().removeIf(pair -> pair.getValue() < 500);

    }
    public static void main(String[] args) {


    }
}