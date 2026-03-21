package com.assignment4.module11;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> printerQueue = new LinkedList<>();

        // Add print jobs
        printerQueue.add("Document1.pdf");
        printerQueue.add("Image.png");
        printerQueue.add("Report.docx");

        // Process jobs
        while (!printerQueue.isEmpty()) {
            String job = printerQueue.poll();
            System.out.println("Printing: " + job);
        }
    }

}
