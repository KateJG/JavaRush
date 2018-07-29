package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String a = rd.readLine();
        int n = Integer.parseInt(rd.readLine());

//        int x = 1;
//        while (x <= n) {
//            System.out.println(a);
//            x++;
//        }

        while(n > 0 ) {
            System.out.println(a);
            n--;
        }



    }
}
