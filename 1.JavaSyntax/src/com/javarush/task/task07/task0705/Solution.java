package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] bigNum = new int[20];
        int[] s1Num = new int[10];
        int[] s2Num = new int[10];


        for(int i = 0 ; i < bigNum.length; i++) {
            bigNum[i] = Integer.parseInt(rd.readLine());
        }

        for(int i = 0; i < 10; i++) {
            s1Num[i] = bigNum[i];
            s2Num[i] = bigNum[i+10];

            System.out.println(s2Num[i]);
        }



    }
}
