package com.practice.linkedlist;

import java.util.Stack;

public class Palindrome {
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
        Palindrome p = new Palindrome();
        p.head = new Node(3);
        p.head.next = new Node(4);
        p.head.next.next = new Node(5);
        p.head.next.next.next = new Node(1);
        p.head.next.next.next.next = new Node(4);
        p.head.next.next.next.next.next = new Node(3);

        System.out.println(palindrome(head));

    }

    private static boolean palindrome(Node head) {
        Node temp = head;
        boolean result = true;
        Stack<Integer> s = new Stack<>();

        while (temp != null){
            s.push(temp.data);
            temp = temp.next;
        }

        while (head != null){
            if (head.data == s.pop()){
                result = true;
            } else {
                return false;
            }
            head = head.next;
        }
        return result;
    }
}
