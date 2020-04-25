package com.trees;

public class CloneATree {
    static Node node;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right =null;
        }
    }
    public static void main(String[] args) {
        node = new Node(3);
        node.left = new Node(2);
        node.right = new Node((4));
        node.left.left = new Node(1);

        printTree(node);
        System.out.println("-----------");
        Node n =cloneATree(node);

       printTree(n);


    }

    private static void printTree(Node node){
        if (node == null)
            return;
        System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);
    }

    private static Node cloneATree(Node node) {
        if (node == null){
            return null;
        }

        Node newnode = new Node(node.data);
        newnode.left = cloneATree(node.left);
        newnode.right = cloneATree(node.right);

        return newnode;
    }
}
