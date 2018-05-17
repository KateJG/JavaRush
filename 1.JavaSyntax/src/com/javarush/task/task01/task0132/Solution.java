package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        /////////////Method1/////////////////////////
//        int a = number;
//        String string = String.valueOf(a); // .valueOf(a) - convert int into String
//        int b = Character.getNumericValue(string.charAt(0)); // .charAt(0) - taking 1st symbol of "546". Then Character.getNumericValue( ) - converting char into int.
//        int c = Character.getNumericValue(string.charAt(1));
//        int d = Character.getNumericValue(string.charAt(2));
//        return b+c+d;

        /////////////Method2///////////////////////////
//        String num = "" + number;
//        String[] result = num.split("");
//        int a = Integer.parseInt(result[0]);
//        int b = Integer.parseInt(result[1]);
//        int c = Integer.parseInt(result[2]);
//        return a + b + c;

        /////////////Method3////////////////////////////////////
//        String s = Integer.toString(number);
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int a = Integer.parseInt(Character.toString(s.charAt(i)));
//            sum += a;
//        }
//        return sum;
//    }

        /////////////Method4/////////////////////////
        //5            //4               //6
        number = (number / 100) + (number % 100 / 10) + (number % 100 % 10);
        return number;
    }
}

