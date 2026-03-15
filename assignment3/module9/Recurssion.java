package com.assignment3.module9;

public class Recurssion {
    static void printNum(int n) {
        if(n == 0) {
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
}
