package com.assignment4.module10;

public class InsertionOfNewNode {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertionOfNewNode list = new InsertionOfNewNode();
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();
    }
}
