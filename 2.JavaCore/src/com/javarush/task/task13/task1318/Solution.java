package com.javarush.task.task13.task1318;

/*
Чтение файла
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(rd.readLine());

        while(inStream.available() > 0) {
        //int data = inStream.read();

            System.out.print((char)inStream.read());
        }

        inStream.close();
        rd.close();


    }

//    public static void main(String[] args) throws IOException
//    {
//        InputStream inStream = new FileInputStream("c:/source.txt");
//        OutputStream outStream = new FileOutputStream("c:/result.txt");
//
//        while (inStream.available() > 0)
//        {
//            int data = inStream.read(); //читаем один байт из потока для чтения
//            outStream.write(data); //записываем прочитанный байт в другой поток.
//        }
//
//        inStream.close(); //закрываем потоки
//        outStream.close();
//    }






}
