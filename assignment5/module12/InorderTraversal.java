package com.assignment5.module12;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class InorderTraversal {
    Node root;

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        InorderTraversal t = new InorderTraversal();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);

        t.inorder(t.root);
    }
}
