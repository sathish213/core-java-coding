package com.string;

public class CharArrayReverse {
    public static void main(String[] args) {
        char[] c = {'a','b','c','d','e'};

        int j = 0;
        int len = c.length-1;
        char temp1;
        for (int i = c.length/2; i>=1; i--){
            temp1 = c[j];
            c[j] = c[len];
            c[len] = temp1;
            System.out.println(c);
            j++;
            len--;
        }
        System.out.println("=====");
        System.out.println(c);
    }
}
