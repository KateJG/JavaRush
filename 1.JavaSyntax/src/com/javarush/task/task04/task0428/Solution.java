package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rd.readLine());
        int b = Integer.parseInt(rd.readLine());
        int c = Integer.parseInt(rd.readLine());

        int m = 0;

//        if(a>0 && b>0 && c>0){
//            m = 3;
//        }
//        else if ((a>0 && b>0)|| (b>0 && c>0) || (a>0 && c>0)) {
//            m = 2;
//        }
//        else if (a>0 || b>0 || c>0) {
//            m = 1;
//        }
//        System.out.println(m);

        if (a > 0) m++;
        if (b > 0) m++;
        if (c > 0) m++;

        System.out.println(m);





    }
}
