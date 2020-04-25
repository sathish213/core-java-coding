package com.practice.interview;

public class DerivedClass extends BaseClass {
    int data;

    public DerivedClass(){
        System.out.println("hlskd");
        data=10;
    }

    public int getData(){
        return data;
    }

    public static void methodDetails(){
        System.out.println("DerivedClass Class");
    }

    public static void main(String[] args) {
        BaseClass b = new DerivedClass();
        System.out.println(b.data);
        System.out.println(b.getData());
        b.methodDetails();
    }
}
