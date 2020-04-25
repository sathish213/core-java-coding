package com.trees;

public class TreeIsBinaryOrNot {
    static Node head;
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
        head = new Node(4);
        head.left = new Node(2);
        head.left.right = new Node(3);
        head.left.left = new Node(1);
        head.right = new Node(5);

        System.out.println(isBST(head, null,null));

    }

    private static boolean isBST(Node head, Node leftData, Node rightData ) {

        if(head == null)
            return true;

        if (leftData != null && leftData.data >= head.data){
            System.out.println(leftData.data+" "+head.data);
            return false;
        }

        if (rightData != null && rightData.data <= head.data){
            System.out.println("right: "+rightData.data+" "+head.data);
            return false;
        }

        return (isBST(head.left,leftData,head)) && (isBST(head.right, head, rightData));
    }
}
