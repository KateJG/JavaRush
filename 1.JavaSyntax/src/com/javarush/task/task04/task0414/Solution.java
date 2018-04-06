package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        if ((nAge % 4 == 0 && nAge % 100 >0) || (nAge % 4 == 0 && nAge % 400 == 0 && nAge % 100 == 0)) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");

        }
    }
}


