package com.javarush.task.task06.task0619;

/* 
Три статические переменных name
*/

public class Solution {

    public static String name;
    public static class Cat {
        public static String name;
    }

    public static class Dog {
        public static String name;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog.name = "Sobaka";
        System.out.println(dog1.name);

    }
}
