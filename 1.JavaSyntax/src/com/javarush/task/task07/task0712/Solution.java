package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int min = 0;
        int max = 0;

        for (int i = 0; i < 10; i++ ) {

            list.add(reader.readLine());

                max = list.get(i).length() > list.get(max).length() ? i : max;
                min = list.get(i).length() < list.get(min).length() ? i : min;

        }
        String s = max < min ? list.get(max) : list.get(min);
        System.out.println(s);
    }
}





