package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1) System.out.println("понедельник");
        if (a == 2) System.out.println("вторник");
        if (a == 3) System.out.println("среда");
        if (a == 4) System.out.println("четверг");
        if (a == 5) System.out.println("пятница");
        if (a == 6) System.out.println("суббота");
        if (a == 7) System.out.println("воскресенье");
        if( 1 > a || a > 7) System.out.println("такого дня недели не существует");

        //System.out.println(a == 1 ? "понедельник": a == 2 ? "вторник": a==3 ? "среда": a==4 ? "четверг": a==5 ? "пятница": a==6 ? "суббота": a==7 ? "воскресенье" : "такого дня недели не существует");
    }
}


