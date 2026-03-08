package com.assignment2.module5;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
