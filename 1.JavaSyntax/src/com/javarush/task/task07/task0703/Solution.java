package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] list = new String[10];
        int[] numbers = new int[list.length];

        for( int i = 0; i < list.length; i++) {
           list[i] = reader.readLine();
           numbers[i] = list[i].length();
        }


        for(int i = 0; i < numbers.length; i++) {
            //int[i] = i;
            System.out.println(numbers[i]);
        }


    }
}
