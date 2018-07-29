package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

//        int a = 1;
//        int b = 1;
//
//        while(a <= 10) {
//            while (b <= 10) {
//                System.out.print(a * b + " ");
//                b++;
//            }
//
//            System.out.println();
//            a++;
//            b=1;
//
        int i=1;
        while (i<=10){
            int j=1;
            while (j<=10){
                if (j==10) System.out.println(i*j); //if j==10 we move to another line
                else System.out.print(i*j+" "); //until j reaches 10 printing results on the same line
                //else System.out.printf("%3d ", i*j);
                j++;
            }
            i++;
        }


        }




    }

