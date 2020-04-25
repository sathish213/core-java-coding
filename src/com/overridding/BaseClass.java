package com.overridding;

public class BaseClass {
    int a =10;
    int b = 20;
    public BaseClass(int a) {
        System.out.println("base constructor");
    }

    public void add(){
        System.out.println("base"+(a+b));
    }

    public static void mul(){
        System.out.println("base static");
    }
}
