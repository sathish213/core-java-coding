package com.practice.linkedlist;

public class DeleteMiddleElement {
    static Node head;
    static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {
        DeleteMiddleElement d = new DeleteMiddleElement();
        d.head = new Node(3);
        d.head.next = new Node(4);
        d.head.next.next = new Node(5);
        d.head.next.next.next = new Node(6);
        d.head.next.next.next.next = new Node(7);
        d.head.next.next.next.next.next = new Node(8);

        deleteMiddleNode(head);
        printList(head);

    }

    private static Node deleteMiddleNode(Node n){
        int count = getCount(n);
        Node temp = n;
        for (int i=0; i < (count/2)-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return  n;
    }

    private static int getCount(Node n){
        int count = 0;
        while (n != null){
            n = n.next;
            count++;
        }
        return count;
    }

    private static void printList(Node n){
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
}
