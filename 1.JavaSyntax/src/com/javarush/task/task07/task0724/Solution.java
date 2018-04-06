package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human motherIrina = new Human("Irina",false,55);
        Human motherIrena = new Human("Irena", false, 75);
        Human fatherVladimir = new Human("Vladimir", true, 36);
        Human fatherNapoleon = new Human ("Napoleon", true, 45);

        Human daughterVaiva = new Human ("Vaiva", false, 45, fatherNapoleon, motherIrena);
        Human daughterKate = new Human ("Kate",false, 36, fatherVladimir, motherIrina);
        Human daughetrMigle = new Human ("Migle", false, 40, fatherNapoleon, motherIrena);
        Human sonTadas = new Human("Tadas", true, 31, null, daughterVaiva);
        Human sonLucas = new Human("Lucas", true, 1, null, daughterKate);

        System.out.println(motherIrina.toString());
        System.out.println(motherIrena.toString());
        System.out.println(fatherVladimir.toString());
        System.out.println(fatherNapoleon.toString());

        System.out.println(daughterVaiva.toString());
        System.out.println(daughterKate.toString());
        System.out.println(daughetrMigle.toString());
        System.out.println(sonTadas.toString());
        System.out.println(sonLucas.toString());


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















