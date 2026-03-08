package com.assignment2.module4;

public class StaticVariableStaticMethod {
    static int count = 0;

    static void showCount() {
        System.out.println("Count is: " + count);
    }

    public static void main(String[] args) {
        StaticVariableStaticMethod.count = 5;
        StaticVariableStaticMethod.showCount();
    }
}
