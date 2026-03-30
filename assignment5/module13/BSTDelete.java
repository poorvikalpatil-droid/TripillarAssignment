package com.assignment5.module13;


    class Node4 {
        int data;
        Node4 left, right;

        Node4(int data) {
            this.data = data;
        }
    }

    public class BSTDelete {

        Node4 insert(Node4 root, int key) {
            if (root == null) return new Node4(key);

            if (key < root.data)
                root.left = insert(root.left, key);
            else
                root.right = insert(root.right, key);

            return root;
        }

        Node4 delete(Node4 root, int key) {
            if (root == null) return null;

            if (key < root.data)
                root.left = delete(root.left, key);
            else if (key > root.data)
                root.right = delete(root.right, key);
            else {
                // node found
                if (root.left == null) return root.right;
                if (root.right == null) return root.left;

                // find minimum in right subtree
                Node4 temp = root.right;
                while (temp.left != null)
                    temp = temp.left;

                root.data = temp.data;
                root.right = delete(root.right, temp.data);
            }
            return root;
        }

        void inorder(Node4 root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

        public static void main(String[] args) {
            BSTDelete obj = new BSTDelete();
            Node4 root = null;

            root = obj.insert(root, 50);
            obj.insert(root, 30);
            obj.insert(root, 70);

            root = obj.delete(root, 30);

            obj.inorder(root);
        }
}
