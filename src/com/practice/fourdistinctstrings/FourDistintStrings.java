package com.practice.fourdistinctstrings;

public class FourDistintStrings {
    public static void main(String[] args) {
        String s = "aaabb";
        boolean b = distint(s);
        System.out.println("results: "+b);
    }

    private static boolean distint(String s) {
        if (s.length() >= 10) {
            return true;
        }
        for (int i =1; i<s.length(); i++) {
            for (int j = i +1; j<s.length(); j++) {
                for (int k = j+1; k<s.length(); k++) {
                    String s1="",s2="",s3="",s4="";
                    s1 = s.substring(0, i);
                    s2 = s.substring(i, j);
                    s3 = s.substring(j, k);
                    s4 = s.substring(k, s.length());
                    System.out.println(s1 + " " + s2 + " "+ s3 + " "+ s4);

                    if (strcheck(s1,s2) && strcheck(s1, s3) && strcheck(s1,s4)
                     && strcheck(s2,s3) && strcheck(s2,s4) && strcheck(s3,s4)) {
                        System.out.println("inside");
                        return  true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean strcheck(String s1, String s2){
        System.out.println("strings: "+s1 + " "+ s2);
        System.out.println("compare"+s1.compareTo(s2));
        if (s1.compareTo(s2) == 0){
            return false;
        }
        return true;
    }
}
