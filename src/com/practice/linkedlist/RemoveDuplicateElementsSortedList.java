package com.practice.linkedlist;

public class RemoveDuplicateElementsSortedList {
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
        RemoveDuplicateElementsSortedList r = new RemoveDuplicateElementsSortedList();
        r.head = new Node(3);
        r.head.next = new Node(4);
        r.head.next.next = new Node(4);
        r.head.next.next.next = new Node(4);
        r.head.next.next.next.next = new Node(8);
        r.head.next.next.next.next.next = new Node(8);

        removeDuplicates(head);
        printList(head);

    }

    private static Node removeDuplicates(Node head) {
        Node temp = head;

        while (temp != null && temp.next != null){
            if (temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    private static void printList(Node n){
        while (n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
}
