package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(number.readLine());
        int b = Integer.parseInt(number.readLine());
        int c = Integer.parseInt(number.readLine());

//             if (a>=b&b>=c) System.out.println(a + " " + b + " " + c);
//        else if (a>=c&c>=b) System.out.println(a + " " + c + " " + b);
//        else if (b>=a&a>=c) System.out.println(b + " " + a + " " + c);
//        else if (b>=c&c>=a) System.out.println(b + " " + c + " " + a);
//        else if (c>=b&b>=a) System.out.println(c + " " + b + " " + a);
//        else if (c>=a&a>=b) System.out.println(c + " " + a + " " + b);

        if (a > b)
        {
            int i = b;
            b = a;
            a = i;
        }
        if (b > c)
        {
            int i = c;
            c = b;
            b = i;
        }
        if (a > b)
        {
            int i = b;
            b = a;
            a = i;
        }

        System.out.println(c + " " + b  + " " + a);


    }

}



