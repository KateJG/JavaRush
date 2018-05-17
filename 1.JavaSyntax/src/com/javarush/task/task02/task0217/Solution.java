package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int x = min(a, b);
        int y = min(c, d);
        if(x < y)
            return x;
        else
            return y;

    }
    public static int min(int a, int b) {
        //напишите тут ваш код
        int min;
        if (a < b)
            min = a;
        else
            min = b;
        return  min;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}