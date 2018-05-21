package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rd.readLine());
        if(a >= 0)
            System.out.println(a*2);
        else
            System.out.println(++a);

    }

}