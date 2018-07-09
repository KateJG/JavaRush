package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(rd.readLine()));


        while(true) {
            String s = rd.readLine();
            writer.write(s);
            writer.newLine();

            if(s.equals("exit")){
                break;
            }
        }

        rd.close();
        writer.close();


    }
}
