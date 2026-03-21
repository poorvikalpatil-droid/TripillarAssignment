package com.assignment4.module8;

public class ReversingAWord {
    public static void main(String[] args) {
        String sentence = "Java class and package";
        String[] words = sentence.split(" ");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse() + " ");
        }
    }

}
