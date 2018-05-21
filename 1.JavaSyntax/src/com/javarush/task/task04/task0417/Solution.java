package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(rd.readLine());
       int b = Integer.parseInt(rd.readLine());
       int c = Integer.parseInt(rd.readLine());

       if(a==b || a==c) System.out.print(a +" ");
       if(b==a || b==c) System.out.print(b +" ");
       if(c==a || c==b) System.out.print(c +" ");




    }
}