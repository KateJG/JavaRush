package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather );

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);


        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }
     // Constructor for upper block
    public static class Cat {
        private String name;
        private Cat m;
        private Cat f;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat m, Cat f) {
            this.name = name;
            this.m = m;
            this.f = f;
        }
        // function for output
        @Override
        public String toString() {
            if (f == null && m == null)
                return "Cat name is " + name + ", no mother, no father ";
            else if (m == null)
                return "Cat name is " + name + ", no mother, " + "father is " + f.name;
            else if (f == null)
                return "Cat name is " + name + ", mother is " + m.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + m.name + ", father is " + f.name;
        }
    }

}
