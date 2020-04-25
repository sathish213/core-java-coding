package com.string;

import java.util.ArrayList;
import java.util.List;

//Write a java program to count the number of occurrences of each character in a string
public class NoOfOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        String s ="hello";

        List l = new ArrayList();

        for (int i = 0; i<s.length(); i++){
            if (!l.contains(s.charAt(i))){
                l.add(s.charAt(i));
                int count = 1;
                for (int j = i+1; j<s.length(); j++){
                    if (s.charAt(i) == s.charAt(j)){
                        count++;
                    }
                }
                System.out.println(s.charAt(i)+" "+ count);
            }

            System.out.println("================");
            charCount(s);
        }
    }

    //alternative method
    private static void charCount(String s){
        while (s.length()>0){
            int count = s.length() - s.replace(String.valueOf(s.charAt(0)),"").length();
            System.out.println(s.charAt(0) + " "+ count);

            s = s.replace(String.valueOf(s.charAt(0)),"");
        }
    }
}
