package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigNum = new int[20];
        int[] my1num = new int[10];
        int[] my2num = new int[10];

        for(int i = 0; i < bigNum.length; i++) {
            bigNum[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < 10; i++) {
            my1num[i] = bigNum[i];
            my2num[i]= bigNum[i+10];
            //System.out.println(my1num[i] +" ");
            System.out.println(my2num[i]);
        }

    }
}
