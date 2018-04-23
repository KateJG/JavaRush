package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> cities = new ArrayList<String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;

            String name = reader.readLine();

            cities.add(city);
            cities.add(name);
        }
        //read home number
        String checkCity = reader.readLine();

        for (int i = 0; i < cities.size(); i += 2) {
            if (cities.get(i).equals(checkCity)) {
                System.out.println(cities.get(i+1));
            }



        }
    }
}
