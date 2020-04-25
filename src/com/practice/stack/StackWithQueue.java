package com.practice.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class StackWithQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    private void enqueue(int x) {
        while(!s1.isEmpty()) {
            int value = s1.pop();
            s2.push(value);
        }

        s1.push(x);
        System.out.println("s1"+s1);
        System.out.println("s2"+s2);
        while(!s2.isEmpty()) {
            int value = s2.pop();
            s1.push(value);
            System.out.println("s1 after: "+s1);
        }
    }

    private int dequeue(){
        return s1.pop();
    }

    public static void main(String[] args) {
        StackWithQueue s = new StackWithQueue();
        s.enqueue(1);
        s.enqueue(2);
        s.enqueue(3);
        /*s.enqueue(5);
        s.enqueue(6);*/
        System.out.println(s.dequeue());
        System.out.println(s.dequeue());
        System.out.println(-1>>>(Integer.numberOfLeadingZeros(15)));
    }
}
