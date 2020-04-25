package com.trees;

public class MirrorTree {
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

    static void inOrder(Node node)
    {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    public static void main(String[] args) {
        node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        inOrder(node);
        System.out.println("-----------");
        mirrorTree(node);
        inOrder(node);


    }

    private static Node mirrorTree(Node node) {
        if (node == null)
            return null;

        Node leftTree = mirrorTree(node.left);
        Node rightTree = mirrorTree(node.right);

        node.right = leftTree;
        node.left = rightTree;
        return node;
    }
}
