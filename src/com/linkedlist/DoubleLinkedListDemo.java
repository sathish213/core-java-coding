package com.linkedlist;

public class DoubleLinkedListDemo {
    static Node node;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            next = prev = null;
        }
    }

    private static Node pushFirst(Node node, int data){
        Node n = new Node(data);

        n.next = node;
        n.prev = null;

        if (node != null){
            node.prev = n;
        }

        node = n;

        return node;
    }

    private static Node pushLast(Node node, int data){
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = node;

        if (node == null){
            newNode.prev = null;
            node = newNode;
            return node;
        }

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return node;
    }

    private static void print(Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static Node pushGivenElementAfter(Node node, int givenValue, int data) {
        Node newnode = new Node(data);

        if (node == null){
            newnode.prev = null;
            node = newnode;
            return node;
        }

        Node temp1 =node;

        while (temp1 != null && temp1.data != givenValue){
            temp1 = temp1.next;
        }
        Node temp = temp1.next;

        temp1.next = newnode;
        newnode.prev = temp1;
        newnode.next = temp;

        return node;
    }
    public static void main(String[] args) {
        node = new Node(3);
        node.next = new Node(5);
        print(node);
        node = pushFirst(node, 7);
        System.out.println("---------");
        print(node);
        System.out.println("-------------");
        node = pushLast(node, 4);
        print(node);

        node = pushGivenElementAfter(node, 3, 9);
        System.out.println("------------------");
        print(node);

    }

}
