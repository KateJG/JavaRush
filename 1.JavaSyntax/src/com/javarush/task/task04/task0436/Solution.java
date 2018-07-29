package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(rd.readLine());
        int n = Integer.parseInt(rd.readLine());

        for(int i = 0; i < m; i++) {
            for ( int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
///////////////vice versa/////////////////
//        for (int i=1; i<=n;i++) {
//            for (int j = 1; j < m; j++)
//                System.out.print("8");
//            System.out.println("8");
//        }


    }
}
