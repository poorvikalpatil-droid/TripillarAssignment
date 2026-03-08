package com.assignment2.module4;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun", "to", "learn"};

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word).append(" ");
        }

        System.out.println("Concatenated String: " + sb.toString().trim());
    }
}
