package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        //2
        try {
            Object o = new String ("Kate");
            System.out.println((Integer)o);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        //3
        try {
            int[] array = new int[0];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        //4
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        //5
        try {
            String s = "";
            System.out.println(s.charAt(2));
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        //6
        try {
            int[] array = new int[-5];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        //7
        try {
            FileInputStream file = new FileInputStream("Readme.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        //8
        try {
            Class<?> myClass = Class.forName("");
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }
        //9
        try {
            Object[] o = new String[10];
            o[3] = 200;
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        //10
        exceptions.add( new NoSuchMethodException());





    }
}
