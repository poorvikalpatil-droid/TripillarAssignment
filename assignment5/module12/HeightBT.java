package com.assignment5.module12;
class NodeD {
    int data;
    NodeD left, right;

    NodeD(int data) {
        this.data = data;
    }
}
public class HeightBT {
    NodeD root;

    int height(NodeD node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String[] args) {
        HeightBT t = new HeightBT();
        t.root = new NodeD(1);
        t.root.left = new NodeD(2);
        t.root.right = new NodeD(3);

        System.out.println("Height: " + t.height(t.root));
    }
}
