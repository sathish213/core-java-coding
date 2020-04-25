package com.practice.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    Node head;
    public static void main(String[] args) {
        LinkedListDemo lld = new LinkedListDemo();
        LinkedListDemo.insert(lld,2);
        LinkedListDemo.insert(lld,6);
        //LinkedListDemo.print(lld);
        //LinkedListDemo.remove(lld, 2);
        //LinkedListDemo.print(lld);

        LinkedListDemo.insert(lld,5);
        LinkedListDemo.insert(lld,7);
        LinkedListDemo.insert(lld,9);
        LinkedListDemo.reverse(lld);
        LinkedListDemo.print(lld);

    }

    private static LinkedListDemo insert(LinkedListDemo ls, int data){
        Node n  = new Node(data);

        if (ls.head == null){
            ls.head = n;
        } else {
            //System.out.println(ls.head.data);
            Node temp = ls.head;

            while (temp.next !=null) {
                temp = temp.next;
            }
            temp.next = n;
        }

        return ls;
    }

    private static void print(LinkedListDemo ls){
        Node n = ls.head;
        //System.out.println("toString: "+n.toString());
        while (n != null){
            System.out.println("results: "+n.data);
            n = n.next;
        }
    }

    private static LinkedListDemo remove(LinkedListDemo lld, int data){
        Node temp = lld.head;
        Node prev = null;
        if (temp.data == data){
            lld.head = temp.next;
            return lld;
        }
        while (temp.data != data){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        return lld;
    }

    private static LinkedListDemo reverse(LinkedListDemo lld) {
        Node current = lld.head;
        Node nextEle = null;
        Node prev = null;

        while (current != null){
            System.out.println("data: "+current.data);
            nextEle = current.next;
            current.next = prev;
            prev = current;
            //System.out.println("next "+next.data);
            current = nextEle;
            //System.out.println("current"+current.data);
        }
        lld.head = prev;
        return lld;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
