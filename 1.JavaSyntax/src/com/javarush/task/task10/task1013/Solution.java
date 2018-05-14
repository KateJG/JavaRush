package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String job;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;


        public Human (String name) {

        }

        public Human (String name, String job) {

        }

        public Human ( String name, String job, boolean sex) {

        }

        public Human(String name, String job, boolean sex, int age) {

        }

        public Human(String name, boolean sex, int age, Human mother){

        }
        public Human(String name, String job, boolean sex, int age, Human father) {

        }

        public Human(String name, boolean sex, int age) {

        }

        public Human(String name, boolean sex,Human father) {

        }

        public Human(String name, Human mother) {

        }
        public Human(String name, boolean sex, int age, Human mother, Human father) {

        }

    }

}
