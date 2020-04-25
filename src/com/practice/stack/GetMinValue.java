package com.practice.stack;

import java.util.Stack;

public class GetMinValue extends Stack<Integer> {
    public static void main(String[] args) {
        GetMinValue gm = new GetMinValue();
        gm.push(5);
        gm.push(8);
        gm.push(1);
        gm.push(9);
        System.out.println("min value: "+ gm.getMin());

    }

    Stack<Integer> s = new Stack<>();

    public void push(int x){
        if (isEmpty() == true) {
            super.push(x);
            s.push(x);
        } else {
            int temp = s.pop();
            super.push(x);
            if(temp > x) {
                s.push(x);
            } else {
                s.push(temp);
            }
        }
    }

    public Integer pop() {
        int popElement = super.pop();
        s.pop();
        return popElement;
    }

    public Integer getMin() {
        return s.peek();
    }
}
