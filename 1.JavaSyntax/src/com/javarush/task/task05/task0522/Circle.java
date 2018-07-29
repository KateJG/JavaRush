package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle() {
        this(5,5,6);

    }

    public Circle(double x , double y, double radius) {

        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public Circle(double x, double y ) {
        this.x = x;
        this.y = y;

    }

    public Circle (Circle newCircle) {
        this.x = newCircle.x;
        this.y = newCircle.y;
        this.radius = newCircle.radius;
    }


    public Circle(double y ) {
        this.y = y;
    }


    public static void main(String[] args) {

    }
}