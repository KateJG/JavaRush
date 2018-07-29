package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String a = rd.readLine();
        int x = Integer.parseInt(a);
        int y = a.length();
        boolean b = y==1;
        boolean c = y==2;
        boolean d = y==3;
        boolean e = (x%2==0);

        if(x >=1 && x <= 999)

        if(e && b) {
            System.out.println("четное однозначное число");
        }
        else if(!e && b) {
            System.out.println("нечетное однозначное число");
        }
        else if(e && c) {
            System.out.println("четное двузначное число");
        }
        else if(!e && c) {
            System.out.println("нечетное двузначное число");
        }
        else if(e && d) {
            System.out.println("четное трехзначное число");
        }
        else if(!e && d) {
            System.out.println("нечетное трехзначное число");
        }



    }
}
