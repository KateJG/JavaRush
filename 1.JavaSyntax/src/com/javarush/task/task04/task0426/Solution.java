package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());

        System.out.println(n == 0 ? "ноль" :
                (n > 0 ? (n % 2 == 0 ? "положительное четное число" : "положительное нечетное число") :
                        (n % 2 == 0 ? "отрицательное четное число" : "отрицательное нечетное число")));


        if (n > 0) {
            if (n % 2 == 0) System.out.println("Positive even number ");
            else System.out.println("Positive odd number");
        } else if (n < 0) {
            if (n % 2 == 0) System.out.println("Negative even number");
            else System.out.println("Negative odd number");
        } else System.out.println("Zero!");


    }


}
