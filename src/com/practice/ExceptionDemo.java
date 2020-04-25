package com.practice;

public class ExceptionDemo {
    public static void main(String[] args) {

        int a=50;
        int b =0;
        try {
            System.out.println(a/b);

        }catch (ArithmeticException e) {
            try {
                System.out.println(a/b);
            }catch (Exception e1) {
                System.out.println("ooooo");
            }

        } catch (Exception e1){

        }
    }
}
