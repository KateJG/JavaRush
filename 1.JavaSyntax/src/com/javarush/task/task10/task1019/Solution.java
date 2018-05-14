package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            if(name.equals("")) break;
            
            map.put(reader.readLine(), Integer.parseInt(name));
        }
        for (Map.Entry pair: map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
            
        }


    }
}
