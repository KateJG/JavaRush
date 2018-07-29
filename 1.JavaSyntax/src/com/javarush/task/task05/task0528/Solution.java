package com.javarush.task.task05.task0528;
import java.util.*;
import java.text.*;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        System.out.println(new SimpleDateFormat("dd MM YYY").format(new Date()));

        Date date = new Date();
        System.out.println(date);



    }
}
