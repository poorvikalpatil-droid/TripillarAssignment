package com.assignment5.module13;


    class NodeF {
        int data;
        NodeF left, right;

        NodeF(int data) {
            this.data = data;
        }
    }

    public class BSTInsertDemo {
        NodeF root;

        NodeF insert(NodeF root, int key) {
            if (root == null) return new NodeF(key);
            if (key < root.data)
                root.left = insert(root.left, key);
            else
                root.right = insert(root.right, key);
            return root;
        }

        void inorder(NodeF root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        public static void main(String[] args) {
            BSTInsertDemo t = new BSTInsertDemo();
            t.root = t.insert(t.root, 50);
            t.insert(t.root, 30);
            t.insert(t.root, 70);

            t.inorder(t.root);
        }
}
