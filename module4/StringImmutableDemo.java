package com.assignment2.module4;

public class StringImmutableDemo {
    public static void main(String[] args) {
        String str = "JAVA";
        System.out.println("Original String: " + str);
        str.concat(" Class");

        System.out.println("After concatenation attempt: " + str);
    }
}
