package com.trees;

import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {
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
    private static int height(Node head) {
        if (head == null) {
            return 0;
        }
        int leftCount = height(head.left);
        int rightCount = height(head.right);
        if (leftCount > rightCount)
            return leftCount + 1;
        else return rightCount + 1;
    }

    private static void levelOrderTravesal(Node node){
        int h = height(node);
        System.out.println("height"+h);

        for (int i =1; i<=h; i++){
            levelOrder(node, i);
            System.out.println();
        }
    }

    private static void levelOrder(Node node, int i) {
        if (node == null)
            return;
        if (i == 1)
            System.out.print(node.data);
        else if (i > 1)
        {
            levelOrder(node.left, i-1);
            levelOrder(node.right, i-1);
        }
    }

    public static void main(String[] args) {
        node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.right = new Node(6);
        //levelOrderTravesal(node);
        tempLevelOrder(node);

    }

    private static void tempLevelOrder(Node node){
        LinkedList<Node> l = new LinkedList<>();
        l.add(node);
        System.out.println(l.size());
        while (true){
            int n = l.size();
            if(n == 0){
                break;
            }

            List<Integer> ll = new LinkedList<>();
            while (n > 0){
                Node temp = l.peek();
                ll.add(temp.data);
                //System.out.print("temp"+temp.data);
                l.remove();
                if (temp.left != null){
                    l.add(temp.left);
                }
                if (temp.right !=null){
                    l.add(temp.right);
                }
                n--;
            }
            System.out.println(ll);
        }

    }
}
