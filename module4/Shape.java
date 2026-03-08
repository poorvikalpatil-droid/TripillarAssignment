package com.assignment2.module4;

abstract class Shape {
    abstract void display(); // abstract method
}

class Circle extends Shape {
    @Override
    void display() {
        System.out.println("Circle shape");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}
