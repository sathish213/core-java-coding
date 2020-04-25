package com.string;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(ispalindrome("ana"));
    }

    private static boolean ispalindrome(String s) {
        String rev = reverse(s);
        if (s.equals(rev)){
            return true;
        }else return false;
    }

    private static String reverse(String s) {
        String temp = "";
        for (int i=s.length()-1; i>=0; i--){
            temp = temp + s.charAt(i);
        }
        return temp;
    }
}
