package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u','y' };

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String sG = "", sS = "";

        for ( int i = 0; i <s.length(); i ++) {
            if (isVowel(s.charAt(i))) {
                sG += s.charAt(i) + " ";
            }
            else {
                if (s.charAt(i)!=' ') {
                    sS += s.charAt(i) + " ";
                }
            }
        }
        System.out.println(sG);
        System.out.println(sS);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}