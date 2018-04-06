package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            //String s = reader.readLine();
            list.add( reader.readLine());
        }

        for (String s : list) {
            System.out.print(s);

        }
        //for(int i = 0; i < list.size(); i++) {
        //    System.out.println(list.get(i));
        //}


    }
}
