package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;

        while(true) { //Infinite loop, not nice but sometimes needed
            double x = Double.parseDouble(rd.readLine());
            if(x != -1) {
                sum = sum +x;
                count++;
            } else
                break;
        }

        System.out.println(sum/count);

    }
}

