package com.assignment5.module13;


    class NodeH {
        int data;
        NodeH left, right;

        NodeH(int data) {
            this.data = data;
        }
    }

    public class BSTMinMaxDemo {

        int findMin(NodeH root) {
            while (root.left != null)
                root = root.left;
            return root.data;
        }

        int findMax(NodeH root) {
            while (root.right != null)
                root = root.right;
            return root.data;
        }

        public static void main(String[] args) {
            NodeH root = new NodeH(50);
            root.left = new NodeH(30);
            root.right = new NodeH(70);

            BSTMinMaxDemo obj = new BSTMinMaxDemo();
            System.out.println("Min: " + obj.findMin(root));
            System.out.println("Max: " + obj.findMax(root));
        }
}
