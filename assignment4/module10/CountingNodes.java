package com.assignment4.module10;

public class CountingNodes {
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

    public int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        CountingNodes list = new CountingNodes();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Number of nodes: " + list.countNodes());
    }
}


