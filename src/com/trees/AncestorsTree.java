package com.trees;

public class AncestorsTree {
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
        node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.left.left.left = new Node(7);

        printAncestors(node, 4);
    }

    private static boolean printAncestors(Node node, int i) {
        if (node == null)
            return false;
        if (node.data == i)
            return true;
        if (printAncestors(node.left, i) || printAncestors(node.right, 1))
        {
            System.out.print(node.data + " ");
            return true;
        }
        return true;
    }
}
