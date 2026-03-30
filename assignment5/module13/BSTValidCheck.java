package com.assignment5.module13;


    class Node5 {
        int data;
        Node5 left, right;

        Node5(int data) {
            this.data = data;
        }
    }

    public class BSTValidCheck {

        boolean isBST(Node5 root, int min, int max) {
            if (root == null) return true;

            if (root.data < min || root.data > max)
                return false;

            return isBST(root.left, min, root.data - 1) &&
                    isBST(root.right, root.data + 1, max);
        }

        public static void main(String[] args) {
            Node5 root = new Node5(50);
            root.left = new Node5(30);
            root.right = new Node5(70);

            BSTValidCheck obj = new BSTValidCheck();
            System.out.println(obj.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        }
}
