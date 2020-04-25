package com.linkedlist;

public class ReverseLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {
        head = new Node(6);
        head.next = new Node(7);
        head.next.next = new Node(8);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(3);

        //head = reverseLinkeList(head);
        head = reverseRecursion(head, null);
        print(head);

    }

    private static Node reverseLinkeList(Node node) {
        Node current = node;
        Node prev = null;
        Node next = null;

        if (current == null){
            return null;
        }

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    private static Node reverseRecursion(Node node, Node prev){
        if (node.next == null){
            head = node;
            node.next = prev;
            return head;
        }

        Node next1 = node.next;
        node.next = prev;
        reverseRecursion(next1, node);
        return head;
    }

    private static void print(Node node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
