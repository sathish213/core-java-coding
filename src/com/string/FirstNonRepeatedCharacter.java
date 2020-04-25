package com.string;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s  = "hllhs";
        for (int i = 0; i<s.length(); i++){
            boolean b = true;
            for (int j = 0; j<s.length(); j++){
                if (i != j && s.charAt(i) == s.charAt(j)){
                    b = false;
                    break;
                }
            }
            if (b){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
