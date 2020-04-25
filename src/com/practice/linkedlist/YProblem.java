package com.practice.linkedlist;

public class YProblem {
    static Node head1, head2;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {
        YProblem y = new YProblem();
        y.head1 = new Node(3);
        y.head1.next = new Node(4);
        y.head1.next.next = new Node(6);
        y.head1.next.next.next = new Node(8);
        y.head1.next.next.next.next = new Node(9);

        y.head2 = new Node(2);
        y.head2.next = new Node(5);
        y.head2.next.next = new Node(6);
        y.head2.next.next.next = new Node(8);
        y.head2.next.next.next.next = new Node(9);

        System.out.println("output" + getTempInterSectionNode(head1, head2));
        System.out.println("count: "+ getCount(head1));
        System.out.println("result: "+ getInterSectionPoint(head1, head2));

    }

    private static int getInterSectionPoint(Node head1, Node head2) {
        int count1 = getCount(head1);
        int count2 = getCount(head2);
        int diff;

        Node temp1 = head1;
        Node temp2 = head2;

        if (count1 > count2){
            diff = count1 - count2;
            for (int i = 0; i<diff; i++) {
                temp1 = temp1.next;
            }
        } else {
            diff = count2 -count1;
            for (int i = 0; i<diff; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != null && temp2 != null){
            if (temp1.data == temp2.data){
                return temp1.data;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

     return -1;
    }

    private static int getCount(Node node) {
        int count = 0;
        while (node != null){
            node = node.next;
            count++;
        }
        return count;
    }

    private static int getTempInterSectionNode(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node res = null;
        while (temp1 != null && temp2 != null){
            //if ()
            while (temp2!=null) {
                if(temp1.data == temp2.data){
                    return temp1.data;
                }
                temp2 = temp2.next;
            }
            temp2 = head2;
            temp1 = temp1.next;

        }
        return -1;
    }
}
