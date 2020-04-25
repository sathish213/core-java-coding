package com.string;

public class Wordreverse {
    public static void main(String[] args) {
        String s = "this is a java program";

        String[] temp = s.split("\\s");
        String rev = "";

        for (int i = temp.length-1; i>= 0; i--){
            rev = rev + temp[i] + " ";
        }
        System.out.println(rev);

        System.out.println(wordReverse(s, 0));
    }

    private static String wordReverse(String s , int i ){
        if (s.isEmpty()){
            return null;
        }
        System.out.println(s);
        if(i == s.length()-1) return null;

        String g = wordReverse(s.split("\\s")[i], i++);
        System.out.println(g);
        return g;
    }
}