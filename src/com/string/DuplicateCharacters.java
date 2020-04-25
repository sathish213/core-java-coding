package com.string;

import java.util.ArrayList;
import java.util.List;

//Write a java program to find duplicate characters in a string
public class DuplicateCharacters {
    public static void main(String[] args) {
        String s = "holloooo";
        /*char[] c = s.toCharArray();

        for (int i =0; i< s.length(); i++){
            for (int j=i+1; j<s.length(); j++){
                if (c[i] == c[j]){
                    System.out.println(c[i]);
                    break;
                }
            }
        }*/
        //duplicateChar(s);
        //effective logic method
        tempDuplicateChar(s);
    }

    private static void duplicateChar(String s){
        char[] c = s.toCharArray();
        char[] temp = new char[s.length()];
        temp[0] = c[0];
        int arrayValue = 1;
        for (int i =0; i<c.length; i++){
            int count = 0;
            for (int j =0 ; j<temp.length; j++){
                if (c[i] == temp[j]){
                    count++;
                    break;
                }
            }
            if (count != 1){
                temp[arrayValue] = c[i];
                arrayValue++;
            }else {
                System.out.println(c[i]);
            }
        }
    }

    private static void tempDuplicateChar(String s){
        List l = new ArrayList();

        while (s.length()>0){
            int count = s.length()-s.replace(String.valueOf(s.charAt(0)), "").length();
            if (count != 1) System.out.println("duplicate char is: "+s.charAt(0));
            s = s.replace(String.valueOf(s.charAt(0)),"");
        }
    }
}
