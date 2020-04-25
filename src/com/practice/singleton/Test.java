package com.practice.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonClass s = SingletonClass.getInstance();
        SingletonClass s1 = SingletonClass.getInstance();
    }
}
