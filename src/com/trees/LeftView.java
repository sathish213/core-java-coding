package com.trees;

public class LeftView {
    static Node node;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static int maxvalue = 0;

    public static void main(String[] args) {
        node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.right = new Node(4);
        node.left.right.right = new Node(5);
        node.left.right.right.right = new Node(6);
        node.right.right = new Node(7);

        printLeftView(node);
    }

    private static void printLeftView(Node node) {
        leftView(node, 1);
    }

    private static void leftView(Node node, int i) {
        if (node == null)
            return;
        if (maxvalue < i){
            System.out.println(node.data);
            maxvalue = i;
        }

        leftView(node.left, i+1);
        leftView(node.right, i+1);

    }
}
