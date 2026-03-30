package com.assignment5.module13;
    class NodeG {
        int data;
        NodeG left, right;

        NodeG(int data) {
            this.data = data;
        }
    }

    public class BSTSearchDemo {

        boolean search(NodeG root, int key) {
            if (root == null) return false;
            if (root.data == key) return true;

            if (key < root.data)
                return search(root.left, key);
            else
                return search(root.right, key);
        }

        public static void main(String[] args) {
            NodeG root = new NodeG(50);
            root.left = new NodeG(30);
            root.right = new NodeG(70);

            BSTSearchDemo obj = new BSTSearchDemo();
            System.out.println(obj.search(root, 30));
        }
}
