package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.


Требования:
1. В классе Solution должны быть реализованы 10 методов printMatrix с различными аргументами.
2. Класс Solution должен быть public.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");


    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
   //3
    public static int printMatrix (int m, int n) {
        return m+n;

    }
    //4
    public static void printMatrix () {
        System.out.println("Default");
    }
    //5
    public static void printMatrix (String name) {
        System.out.println(name);

    }

    //6
    public static void printMatrix (Object title) {
        System.out.println(title);

    }

    //7
    public static double printMatrix (double m, double n) {
        return m * n;

    }

    //8
    public static void printMatrix (int m, Object o) {
        System.out.println("Matrix number 8");
    }

    //9
    public static void printMatrix (Integer m, int n, Object value) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(value);
            }
        }
    }

    //10
    public static void printMatrix (int m, int n, int o) {
        System.out.println(m+n+o);
            }



}


