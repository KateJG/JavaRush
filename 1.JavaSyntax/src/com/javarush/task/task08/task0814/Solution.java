package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        HashSet<Integer> new_set = new HashSet<>();

        for (int j: set) {
            if (j > 10) {
                new_set.add(j);
            }
        }
        set.removeAll(new_set);
        return set;

    }

    public static void main(String[] args) {

        System.out.println(removeAllNumbersMoreThan10(createSet()));


    }
}
