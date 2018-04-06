package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] list = new int[5];

        //заполнение массива
        for (int i = 0; i < list.length; i++)
            list[i] = Integer.parseInt(reader.readLine());

        //вывод на экран
        for (int i = 0; i < list.length; i++)
            System.out.println(list);
    }
}
