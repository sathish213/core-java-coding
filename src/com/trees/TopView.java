package com.trees;

import java.util.*;

public class TopView {
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

    public static void main(String[] args) {
        node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.right = new Node(6);
        node.right.right.left = new Node(7);

        //printToplevel(node);
        effectivePrintTopLevel(node);
    }

    private static void effectivePrintTopLevel(Node node) {
        class QueueObject {
            Node nodeData;
            int level;

            QueueObject(Node nodeData, int level) {
                this.nodeData = nodeData;
                this.level = level;
            }
        }

        Queue<QueueObject> q = new LinkedList<>();
        Map<Integer, Node> map = new TreeMap<>();

        if(node == null) {
            return;
        }
        else {
            q.add(new QueueObject(node, 0));
        }

        while (!q.isEmpty()){
            QueueObject temp = q.remove();

            if (!map.containsKey(temp.level)){
                map.put(temp.level, temp.nodeData);
            }

            if (temp.nodeData.left != null){
                q.add(new QueueObject(temp.nodeData.left, temp.level-1));
            }

            if (temp.nodeData.right != null){
                q.add(new QueueObject(temp.nodeData.right, temp.level+1));
            }
        }

        for (Map.Entry<Integer, Node> entry : map.entrySet()){
            System.out.println(entry.getValue().data);
        }
            //map.forEach((key, value)->System.out.println(value));

    }

    /*private static void printToplevel(Node node) {
        if (node == null)
            return;
        System.out.println(node.data);
        printLeft(node.left);
        printRight(node.right);

    }

    private static void printLeft(Node n){
        if (n == null){
            return;
        }
        while (n != null){
            System.out.println(n.data);
            n = n.left;
        }
    }

    private static void printRight(Node n){
        if (n == null){
            return;
        }
        while (n != null){
            System.out.println(n.data);
            n = n.right;
        }
    }*/
}
