package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("chinna","chandu","raju","anna");

        String output = l.stream().filter(data -> "raju".equals(data)).findAny().orElse(null);
        System.out.println("output: "+output);
    }
}
