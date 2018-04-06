package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x = 0;
        int a = 0;
        int b = 0;
        while(x != -1) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            x = Integer.parseInt(reader.readLine());
            if (x != -1) {
                a +=x;
                b +=1;
            }

        }
        System.out.println((double) a/b);


    }
}

