package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());
        int b = Integer.parseInt(number.readLine());
        int c = Integer.parseInt(number.readLine());
        int d = Integer.parseInt(number.readLine());

    /////////Solution with class Math
//        if (Math.max(a,b) > Math.max(c,d))
//            System.out.println(Math.max(a,b));
//        else System.out.println(Math.max(c,d));
//
/////////////////Solution without Math by creating Method max myself
        if(max(a, b) > max(c, d))
            System.out.println(max(a,b));
        else
            System.out.println(max(c,d));

        }

    public static int max (int a, int b) {

        if(a>b) return a;
        else return b;

    }
}
