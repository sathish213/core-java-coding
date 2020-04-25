package com.string;

//Write a java program to count the total number of occurrences of a given character in a string without using any loop
public class CharacterOccurrences {
    public static void main(String[] args) {
        String s = "hello";
        char input = 'l';

        int occurrence = s.length()- s.replace(String.valueOf(input),"").length();
        System.out.println(occurrence);
    }
}
