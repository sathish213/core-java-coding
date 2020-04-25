package com.string;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "radar";
        String uni = "";
        char[] c = s.toCharArray();
        int count = 0;

        char [] temp = new char[c.length];
        for (int i=0; i<c.length; i++){
            int value = 0;

            for (int j=0; j<c.length; j++){
                if (i!=j && c[i] == c[j]){
                    value++;
                    break;
                }
            }
            if (value==0){
                temp[count] = c[i];
                count++;
            }
        }
        System.out.println(temp);
    }
}
