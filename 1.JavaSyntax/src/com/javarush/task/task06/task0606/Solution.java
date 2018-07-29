package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(rd.readLine());

        while (num != 0) {
            if (num%2 == 0){
                even++;
            } else odd++;
            num /=10;
        }

//        for (; num != 0; num /= 10) {
//            if (num %2 == 0) {
//                even ++;
//            }
//            else {
//                odd++; }



//        String s = rd.readLine();
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (Character.getNumericValue(s.charAt(i)) % 2 == 0)
//                even++;
//            else
//                odd++;
//        }
//
//        System.out.println("Even: " + even + " Odd: " + odd);
//    }
//}




        System.out.println("Even: " +even+ " Odd " + odd);

    }
}
