package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();


    static{
        for (int i = 0; i < 5; i++) {
            labels.put((double)i, " Static " + i );
        }
    }




    public static void main(String[] args) {
        System.out.println(labels);
    }



}
