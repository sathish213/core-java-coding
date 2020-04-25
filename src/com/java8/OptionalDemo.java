package com.java8;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("chinna");
        String s1 = "raju";
        Optional<String> s2 = Optional.empty();

        System.out.println(s);
        System.out.println(s.get());
        System.out.println(Optional.empty());
        System.out.println(Optional.ofNullable(s));

        System.out.println("--------------------");
        System.out.println(s.map(String::toUpperCase));

        System.out.println(s.filter(i-> i.equals("chinna1")));
        System.out.println(s.isPresent());
        s.ifPresent(i-> System.out.println(i));
        System.out.println(s2.orElse("vvv"));
    }
}
