package com.trees;

public class KthSmallestElementInABST {
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
        root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);

        Node data = findKthSmallestElement(root, 5);
        System.out.println("results: "+data.data);
    }

    private static Node findKthSmallestElement(Node root, int i) {
        if (root == null){
            return null;
        }

         Node leftdata = findKthSmallestElement(root.left, i);

        if (counter != i){
            counter++;
            leftdata = root;
        }

        if (counter == i){
            return leftdata;
        } else {
            return findKthSmallestElement(root.right, i);
        }
    }
}
