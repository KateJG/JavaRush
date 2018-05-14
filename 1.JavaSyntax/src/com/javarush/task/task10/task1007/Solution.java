package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int i = 5;
        float f = 444.23f;
        String s = "17";
        Object o = f;                       //o хранит объект типа Float

        if (o instanceof  Integer)
        {
            Integer i2 = (Integer) o;
        }
        else if (o instanceof  Float)
        {
            Float f2 = (Float) o;            //отработает именно этот if
        }
        else if (o instanceof  String)
        {
            String s2 = (String) o;
        }
    }
}