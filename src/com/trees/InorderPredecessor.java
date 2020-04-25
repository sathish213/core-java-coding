package com.trees;

public class InorderPredecessor {
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

        Node value = root.left.right.left;
        inorderPredecessor(root, value);
    }

    private static void inorderPredecessor(Node root, Node value) {
        if (root == null)
            return;
        if (value.left != null){
            System.out.println("prec: "+ prevValue(value.left));
        }

        if (value.left == null){
            System.out.println("predecessor: "+predecessor(root, value));
        }
    }

    private static int predecessor(Node root, Node value) {
        System.out.println("value: "+ value.data);
        int data = root.data;
        while (root != null){
            if (root.data > value.data){
                root = root.left;
            }
            if (root.data < value.data){
                data = root.data;
                System.out.println("data: "+data);
                root = root.right;
            }
            if (root.data == value.data){
                return data;
            }
        }
        return data;
    }


    private static int prevValue(Node left) {
        Node temp = left;
        while (temp.right != null){
            temp = temp.right;
        }
        return temp.data;

    }
}
