package com.practice.interview;

public class BaseClass {
    int data;

    public BaseClass(){
        System.out.println("base const");
        data = 5;
    }

    public int getData(){
        return this.data;
    }

    public static void methodDetails(){
        System.out.println("Base Class");
    }
}
