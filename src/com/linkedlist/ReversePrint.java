package com.linkedlist;

public class ReversePrint {
    static Node node;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        node = new Node(7);
        node.next = new Node(1);
        node.next.next = new Node(5);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(9);

        //reversePrint(node);
        Node results = reverseLinkedList(node);
        print(results);
    }

    private static void print(Node results) {
        while (results != null){
            System.out.println(results.data);
            results = results.next;
        }
    }

    private static Node reverseLinkedList(Node n){
        if (n.next == null){
            node = n;
            return node;
        }
        reverseLinkedList(n.next);
        Node temp = n.next;
        temp.next = n;
        n.next = null;

        return node;
    }

    private static void reversePrint(Node node) {
        if (node == null)
            return;
        reversePrint(node.next);
        System.out.println(node.data);
    }
}
