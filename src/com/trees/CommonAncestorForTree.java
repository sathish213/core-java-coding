package com.trees;

public class CommonAncestorForTree {
    static Node node;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = right = null;
        }

        public static void main(String[] args) {
            node = new Node(1);
            node.left = new Node(2);
            node.right = new Node(3);
            node.left.left = new Node(4);
            node.left.right = new Node(5);
            node.right.left = new Node(6);
            node.right.right = new Node(7);
            System.out.println(commonAncestorInTree(node, 2,4));
        }

        private static int commonAncestorInTree(Node node, int value1, int value2) {
            if (node == null)
                return -1;

            if (node.data == value1 || node.data == value2){
                return node.data;
            }

            int leftData = commonAncestorInTree(node.left, value1, value2);
            int rightData = commonAncestorInTree(node.right, value1, value2);

            if (leftData != -1 && rightData != -1){
                return node.data;
            }else if (leftData != -1){
                return leftData;
            }else {
                return rightData;
            }
        }
    }
}
