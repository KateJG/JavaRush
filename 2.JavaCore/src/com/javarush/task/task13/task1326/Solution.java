package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        ArrayList <Integer> list = new ArrayList<Integer>();
        String line;

        while((line = fileReader.readLine()) != null)
            if((Integer.parseInt(line)) % 2 == 0) {

            list.add(Integer.parseInt(line));
        }

        Collections.sort(list);

        reader.close();
        fileReader.close();

        for(int i : list) {
            System.out.println(i);
        }








    }
}
