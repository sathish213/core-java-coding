package com.overridding;

public class OverRiddingDemo extends BaseClass{
    /*public OverRiddingDemo() {
        System.out.println("parent constructor");
    }*/

    public OverRiddingDemo(int x){
        super(x);
    }

    /*public void add(){
        System.out.println("OverRiddingDemo");
    }*/

    public static void mul(){
        System.out.println("base static");
    }

    public static void main(String[] args) {
        OverRiddingDemo b = new OverRiddingDemo(10);
        b.add();
        b.mul();
    }
}
