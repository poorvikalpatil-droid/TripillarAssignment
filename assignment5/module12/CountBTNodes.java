package com.assignment5.module12;
class NodeE {
    int data;
    NodeE left, right;

    NodeE(int data) {
        this.data = data;
    }
}
public class CountBTNodes {
    NodeE root;

    int count(NodeE node) {
        if (node == null) return 0;
        return 1 + count(node.left) + count(node.right);
    }

    public static void main(String[] args) {
        CountBTNodes t = new CountBTNodes();
        t.root = new NodeE(1);
        t.root.left = new NodeE(2);
        t.root.right = new NodeE(3);

        System.out.println("Total Nodes: " + t.count(t.root));
    }
}
