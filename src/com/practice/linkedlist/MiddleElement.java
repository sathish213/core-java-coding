package com.practice.linkedlist;

public class MiddleElement {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        MiddleElement m = new MiddleElement();
        m.head = new Node(3);
        m.head.next = new Node(4);
        m.head.next.next = new Node(5);
        m.head.next.next.next = new Node(6);
        m.head.next.next.next.next = new Node(7);
        m.head.next.next.next.next.next = new Node(8);

        System.out.println("middle element: "+ getMiddleElement(head));

    }

    private static int getMiddleElement(Node n) {
        int count = getCount(n);
        System.out.println("count "+ count/2);
        Node temp = n;
        for (int i = 0; i< count/2; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    private static int getCount(Node n){
        int count = 0;
        while (n != null){
            n = n.next;
            count++;
        }
        return count;
    }
}
