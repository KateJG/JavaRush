package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top,  left, width, height;

    public void initialize( int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width= width;
        this.height = height;
    }
    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
    }
    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize( Rectangle rectangle) {
        top = rectangle.top;
        left = rectangle.left;
        width = rectangle.width;
        height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
