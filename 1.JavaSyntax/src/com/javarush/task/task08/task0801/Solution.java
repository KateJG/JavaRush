package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        HashSet<String> set = new HashSet<String>();
        Collections.addAll(set,"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "женьшень", "земляника", "ирис", "картофель");
        /*set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель"); */
        //Iterator

        for(String text: set) {
            System.out.println(text);
        }



    }
}
