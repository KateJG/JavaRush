package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //convertEurToUsd(20, 1.2);
        //convertEurToUsd(10, 1.3);
        System.out.println(convertEurToUsd(20, 1.2));
        System.out.println(convertEurToUsd(10, 1.3));






    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur * course;

    }
}
