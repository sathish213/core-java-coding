package com.practice.trees;


public class BinaryTreeDemo {
    private static Node root;

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    public BinaryTreeDemo(int data){
        root = new Node(data);
    }

    public BinaryTreeDemo(){
        root = null;
    }

    private void printBinaryTree(Node node){
        if (node != null){
            System.out.println(node.data);
            System.out.println(node.left.data);
            System.out.println(node.right.data);
        }
    }

    private void inOrder(Node node){
        if (node == null)
            return;

        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    private void preOrder(Node node){
        if (node == null)
            return;

        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    private void postOrder(Node node){
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        BinaryTreeDemo b = new BinaryTreeDemo();
        b.root = new Node(6);
        b.root.left = new Node(5);
        b.root.right = new Node(7);
        b.root.left.left = new Node(9);

        //b.printBinaryTree(root);
        //b.inOrder(root);
        //b.preOrder(root);
        b.postOrder(root);

    }
}
