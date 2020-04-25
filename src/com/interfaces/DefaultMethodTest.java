package com.interfaces;

import com.java8.Devlopers;

public class DefaultMethodTest implements Interface1, Interface2 {
    public static void main(String[] args) {
        DefaultMethodTest d = new DefaultMethodTest();
        d.add();
    }

    @Override
    public void mul() {
        System.out.println("mul");
    }

    @Override
    public void add() {
        System.out.println("in calss");
    }


}
