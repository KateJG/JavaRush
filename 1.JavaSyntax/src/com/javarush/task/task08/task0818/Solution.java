package com.javarush.task.task08.task0818;

import java.util.HashMap;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            map.put("Name" + i, 500*i );
        }
        return map;

    }

    public static HashMap<String, Integer> removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(pair -> pair.getValue() < 500);

        return map;
    }

    public static void main(String[] args) {

        //removeItemFromMap(createMap());
        HashMap<String, Integer> myMap = removeItemFromMap(createMap());
        System.out.println(myMap);

    }
}