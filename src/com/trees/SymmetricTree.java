package com.trees;

public class SymmetricTree {
    static Node root;
    static int counter;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);

        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(Node root) {
        if (root == null){
            return true;
        }
        return isSymmetrictest(root.left, root.right);
    }

    private static boolean isSymmetrictest(Node left, Node right) {
        boolean results = false;

        if (left == null && right == null){
            results = true;
        }

        if (left != null && right != null){
            results = (left.data == right.data) && isSymmetrictest(left.left, right.right) && isSymmetrictest(left.right, right.left);
        }

        return results;
    }
}
