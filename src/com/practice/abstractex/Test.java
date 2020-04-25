package com.practice.abstractex;

public class Test extends AbstractDemo {
    public static void main(String[] args) {
        AbstractDemo ad = new Test() ;
        ad.add();
        System.out.println(fact(4));
    }

    private static int fact(int n) {
        if (n == 1) {
            System.out.println("inside if"+n);
            return 1;
        }
        System.out.println("out side: "+n);
        return (n * fact(n-1));
    }
}
