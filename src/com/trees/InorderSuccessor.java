package com.trees;

public class InorderSuccessor {
    static Node root;
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

        Node value = root;
        inorderSuccessor(root, value);
    }

    private static void inorderSuccessor(Node root, Node value) {
        if (value.right != null){
            System.out.println("successor: "+ nextElement(value.right));
        }

        if (root.data > value.data){
            System.out.println("succ: "+ successor(root, value));
        }
    }

    private static int successor(Node root, Node value) {
        System.out.println("value: "+ value.data);
        int data = root.data;
        while (root != null){
            if (root.data > value.data){
                data = root.data;
                System.out.println("data: "+data);
                root = root.left;
            }
            if (root.data < value.data){
                root = root.right;
            }
            if (root.data == value.data){
                return data;
            }
        }
        return data;
    }

    private static int nextElement(Node right) {
        Node max = right;
        if (max.left != null){
            max = max.left;
        }
        return max.data;
    }
}
