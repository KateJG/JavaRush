package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] myNumbers = new int[10];

        for (int i = 0; i < myNumbers.length; i++) {

            myNumbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = myNumbers.length - 1; i >= 0; i--) {
            //myNumbers[i] = 10-i;


            System.out.println(myNumbers[i]);
        }


    }
}

