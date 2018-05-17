package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {

        for( int i = 1; i <=10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.printf("%d ", j * i); // if we add %2d,or 3-4d it would look
                // clearer,as it will be formatted as 2decimal format number etc.
                // In this table I would enter "%3d" as the last number is 100 3decimal
            }
            System.out.println();
        }

        }

    }

