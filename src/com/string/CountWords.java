package com.string;

///Write a java program to count the number of words in a string
public class CountWords {
    public static void main(String[] args) {
        String s = "  this is a  string  ";
        String [] temp = s.trim().split(" ");
        System.out.println("words : "+temp.length);
        int count = 0;
        for (String data: temp){
            if (!data.isEmpty()) count++;
        }
        System.out.println(count);
    }

}
