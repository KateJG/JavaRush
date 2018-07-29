package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

//        String s = "SSSSSSSSSS";
//        int n = 10;
//        while(n >=1 ) {
//            System.out.println(s);
//            n--;
//        }
        int n = 0;
        while(n < 100) {
            System.out.print("S");
            n++;
            if(n % 10 == 0) System.out.println();
        }



    }
}
