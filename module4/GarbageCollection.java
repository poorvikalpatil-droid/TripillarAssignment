package com.assignment2.module4;

public class GarbageCollection {
    @Override
    protected void finalize() {
        System.out.println("Garbage collector called and object destroyed");
    }

    public static void main(String[] args) {
        GarbageCollection obj = new GarbageCollection();
        obj = null;
        System.gc();
        System.out.println("End of main method");
    }
}


