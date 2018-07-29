package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

//        while (true) {
//            int i = Integer.parseInt(rd.readLine());
//            sum = sum + i;
//            if (i == -1) {
//                System.out.println(sum);
//                break;
//            }
//
//        }
/////////////SAme with forLoop///////////////////////
        for (int i = 0; i != -1;  i++) {
            int x = Integer.parseInt(rd.readLine());
            sum += x;
            if (x == -1) break;
        }
        System.out.println(sum);


    }
}




