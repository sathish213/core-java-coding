package com.string;

public class Reverserecurrsion {
    public static void main(String[] args) {
         reverse("chinna");
        //System.out.println(rev);
    }

    private static void reverse(String s) {
        if (s==null || s.length() <=1){
            System.out.println("output: "+s);
        }else{
            System.out.print("rev: "+s.charAt(s.length()-1));
            reverse(s.substring(0, s.length()-1));
        }
    }
}
