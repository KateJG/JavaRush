package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    //напишите тут ваш код

    static int catCount;

    public Cat() {
        Cat.catCount ++;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println(Cat.catCount);

    }
}
