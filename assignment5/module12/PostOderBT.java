package com.assignment5.module12;
class NodeC {
    int data;
    NodeC left, right;

    NodeC(int data) {
        this.data = data;
    }
}
public class PostOderBT {
    NodeC root;

    void postorder(NodeC node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        PostOderBT t = new PostOderBT();
        t.root = new NodeC(1);
        t.root.left = new NodeC(2);
        t.root.right = new NodeC(3);

        t.postorder(t.root);
    }
}
