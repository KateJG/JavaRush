package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int n = Integer.parseInt(reader.readLine());

        for(int i = 0; i < n; i ++) {
            int m = Integer.parseInt(reader.readLine());
            if(m > maximum)
                maximum = m; // assigning 1-st entered value to maximum variable
        }

        System.out.println(maximum);
    }
}
