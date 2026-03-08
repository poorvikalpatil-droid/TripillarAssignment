package com.assignment2.module4;

public class StaticBlock {
    static {
        System.out.println("Static block executed before main method.");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
