package com.string;

//Java program to check whether one string is rotation of another string.
public class RotationOfAnother {
    public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        System.out.println(rotationOfAnother(s1,s2));

    }

    private static boolean rotationOfAnother(String s1, String s2) {
        String s = s1+s1;
        if (s1.length() != s2.length()){
            return false;
        }
        if (s.contains(s2)){
            return true;
        }
        return false;
    }

}
