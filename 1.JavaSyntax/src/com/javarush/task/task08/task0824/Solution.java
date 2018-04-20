package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        ArrayList<Human> children = new ArrayList<>();

        Human kid1 = new Human("kidA", true, 7,children);
        Human kid2 = new Human("kidB", true, 5,children);
        Human kid3 = new Human("kidC", true, 3,children);
        ArrayList<Human> kids = new ArrayList<>();
        kids.add(kid1);
        kids.add(kid2);
        kids.add(kid3);

        Human mama = new Human("Irina", false, 36, kids);
        Human papa = new Human("Vova", true, 35, kids);
        ArrayList<Human> parentmama = new ArrayList<>();
        parentmama.add(mama);
        ArrayList<Human> parentpapa = new ArrayList<>();
        parentpapa.add(papa);


        Human grmompapa = new Human("Katya", false, 65, parentpapa );
        Human grfathpapa = new Human("Misha", true, 65, parentpapa);

        Human grmommama = new Human("Tamara", false, 64, parentmama);
        Human grfathmama = new Human("Nikolas", true, 66, parentmama);
        ArrayList<Human> grannies = new ArrayList<>();
        grannies.add(grmommama);
        grannies.add(grmompapa);
        grannies.add(grfathpapa);
        grannies.add(grfathmama);

        ArrayList<Human> family = new ArrayList<>();
        family.addAll(kids);
        family.addAll(parentmama);
        family.addAll(parentpapa);
        family.addAll(grannies);


        for (Human person: family)
        {
            System.out.println(person.toString());
        }

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }




        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
