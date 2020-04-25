package com.stack;

import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
        Stack s = new Stack();
        String name  = "chinna";

        for (int i =0; i< name.length(); i++){
            s.push(name.charAt(i));
        }

        String temp = "";
        for (int i=0; i<name.length(); i++){
            temp = temp + s.pop();
        }
        System.out.println(temp);

    }
}
