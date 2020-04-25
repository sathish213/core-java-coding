package com.trees;

public class MaxHeightOfBinaryTree {
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
        head = new Node(5);
        head.left = new Node(4);
        head.right = new Node(5);
        head.right.right = new Node(5);
        head.right.right.right = new Node(5);
        head.right.right.right.right = new Node(5);
        head.right.right.right.right.left = new Node(5);
        head.left.left = new Node(5);
        head.left.left.left = new Node(5);
        head.left.left.left.left = new Node(5);

        int value = maxHeight(head);
        System.out.println("result: "+value);


    }

    private static int maxHeight(Node head) {
        if (head == null){
            return 0;
        }
        int leftCount = maxHeight(head.left);
        int rightCount = maxHeight(head.right);
        if (leftCount > rightCount)
            return leftCount+1;
        else return rightCount+1;
        /*Node temp = head;
        Node temp1 = head;

        while (temp != null){
            temp = temp.left;
            leftCount++;
        }

        while (temp1 != null){
            temp1 = temp1.right;
            rightCount++;
        }
        System.out.println("right: "+rightCount+" left: "+leftCount);
       int max = Math.max(rightCount, leftCount);
        return max;*/
    }
}
