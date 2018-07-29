package com.javarush.task.task14.task1404;

/* 
Коты
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = "";
//        while(true) {
//            s = reader.readLine();
//            if (s.equals(""))
//                break;
//                Cat cat = CatFactory.getCatByKey(s);
//
//                System.out.println(cat);
//
//        }
//
//    }

//    public static void main (String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list = new ArrayList<>();
//        while(true) {
//            String s = reader.readLine();
//            if(s.isEmpty())
//                break;
//            list.add(s);
//        }
//        //reader.close();
//        for (String st : list) {
//            Cat cat = CatFactory.getCatByKey(st);
//            System.out.println(cat.toString());
//        }
//
//
//    }

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>();
        //List<Cat> cats = new ArrayList<Cat>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s;
            do {
                s = reader.readLine();
                if (s.isEmpty()) {
                    break;
                }
                list.add(s);
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
            }
            for (String st : list) {
            Cat cat = CatFactory.getCatByKey(st);
                System.out.println(cat.toString());
            }

    }


    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
