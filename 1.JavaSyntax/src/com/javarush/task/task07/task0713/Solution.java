package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> adList = new ArrayList<Integer>();


        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));

            Integer x = mainList.get(i);
                if (x % 3 == 0)
                list3.add(x);
                if(x % 2 == 0)
                 evenList.add(x);
                if (x % 3 != 0 && x % 2 !=0)
                adList.add(x);

        }

        printList(list3);
        printList(evenList);
        printList(adList);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
            for ( Integer x : list)
            System.out.println(x);

    }
}
