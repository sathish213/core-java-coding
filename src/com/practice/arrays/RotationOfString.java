package com.practice.arrays;

import java.util.Properties;

public class RotationOfString {
    public static void main(String[] args) {
        String s = "chinna";
        int d = 1;

        String right = s.substring(d) + s.substring(0,d);
        System.out.println("right: "+right);

        String left = s.substring(s.length()-d)+s.substring(0,s.length()-d);
        System.out.println("left: "+ left);

        Properties p = System.getProperties();
        System.out.println(p);
        System.out.println(System.getProperty("java.home"));
    }
}
