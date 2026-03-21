package com.assignment4.module10;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL {
    Node head;

    // Display all elements
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        list.display();
    }
}


