package com.assignment4.module11;

public class QueueUsingArray {
    int[] queue;
    int front, rear, size;

    QueueUsingArray(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = value;
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}


