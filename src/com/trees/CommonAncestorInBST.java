package com.trees;

public class CommonAncestorInBST {
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
    public static void main(String[] args) {
        node = new Node(20);
        node.left = new Node(8);
        node.right = new Node(22);
        node.left.left = new Node(4);
        node.left.right = new Node(12);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(14);

        System.out.println(commonAncestorInBST(node, 14, 8));

    }

    private static int commonAncestorInBST(Node node, int value1, int value2) {
        if (node == null)
            return -1;
        if (node.data == value1 || node.data == value2){
            return node.data;
        }

        if (node.data > value1 && node.data > value2){
            return commonAncestorInBST(node.left, value1, value2);
        } else if (node.data < value1 && node.data < value2){
            return commonAncestorInBST(node.right, value1, value2);
        } else {
            return node.data;
        }
    }
}
