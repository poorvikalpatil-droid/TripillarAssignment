package com.assignment4.module10;

public class InsertNodeAtTheEnd {
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
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
        InsertNodeAtTheEnd list = new InsertNodeAtTheEnd();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.display();
    }
}
