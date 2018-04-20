package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int x = 1, max = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                x++;
            } else x = 1;
            if (x > max) {
                max = x;
            }

        }

        System.out.println(max);
    }


}