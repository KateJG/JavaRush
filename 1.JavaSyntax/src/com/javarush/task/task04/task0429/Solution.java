package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());

        int x = 0, y = 0;

        if(a!=0) {
        if(a>0) x++;
        else y++; }

        if(b!=0) {
        if(b>0) x++;
        else y++; }

        if(c!=0) {
        if(c>0) x++;
        else y++; }

        System.out.println("количество отрицательных чисел: " + y + " \nколичество положительных чисел: " + x);





    }
}
