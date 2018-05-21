package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        double minutes = Double.parseDouble(rd.readLine());
        double t = minutes%5;
        if (t <= 2.99) {
            System.out.println("зелёный");
        }
        else if(t <=3.99) {
            System.out.println("жёлтый");
        }
        else System.out.println("красный");

    ////////////////Method2///////////////////
//        if (t <= 3)
//            System.out.println("зелёный");
//        else if (t <= 4)
//            System.out.println("жёлтый");
//        else if (t!= 0)
//            System.out.println("красный");

 //////////////////////Method3///////////////////
//        if (t >=0 && t <3 )
//            System.out.println("зелёный");
//        else if (t >=3 && t <4)
//            System.out.println("желтый");
//        else if (t >=4 && t <5)
//            System.out.println("красный");



    }
}