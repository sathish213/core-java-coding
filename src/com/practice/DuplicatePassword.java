package com.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicatePassword {
    public static void main(String[] args) {
        String arr[] = {"abcd", "acbd","adcb", "cdba", "bcda", "badc"};

        int arr1[] = {1234, 3214, 4321};

        //int result = duplicate(arr, arr.length);
        int result = duplicateInteger(arr1,arr1.length);
        System.out.println("result: "+result);
    }

    private static int duplicate(String arr[], int l) {
        Set<String> s = new HashSet();

        int count = 0;
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i].toCharArray());
            if (!s.contains(encodeString(arr[i].toCharArray()))){
                s.add(encodeString(arr[i].toCharArray()));
                count++;
            }
        }
        System.out.println("count: "+count);
        return count;
    }

    private static String encodeString(char[] str) {
        int even[] = new int[26];
        int odd[] = new int[26];

        for (int i=0; i<str.length; i++) {
            char c = str[i];
            if ((i & 1) != 0) {
                odd[c - 'a']++;
            } else
                even[c - 'a']++;
        }

        String encoding = "";
        for (int i = 0; i < 26; i++) {
            encoding += (even[i]);
            encoding += ('-');
            encoding += (odd[i]);
            encoding += ('-');
        }
        System.out.println("encoding"+encoding);
        return  encoding;
    }

    private static int duplicateInteger(int [] arr, int l) {
        Set<String> s = new HashSet<>();

        int count = 0;
        for (int i=0; i<arr.length;i++) {
            if (!s.contains(encodeInteger(("" + arr[i]).toCharArray()))) {
                s.add(encodeInteger(("" + arr[i]).toCharArray()));
                count++;
            }
        }
        return count++;
    }

    public static String encodeInteger(char[] str) {
        int even[] = new int[10];
        int odd[] = new int[10];

        for (int i=0; i<str.length; i++ ){
            char c = str[i];
            if ((i & 1) != 0) {
                odd[c - '0']++;
            } else
                even[c - '0']++;
        }

        String encoding = "";
        for (int i = 0; i < 10; i++) {
            encoding += (even[i]);
            encoding += ('-');
            encoding += (odd[i]);
            encoding += ('-');
        }
        System.out.println("encoding"+encoding);
        return  encoding;
    }
}
