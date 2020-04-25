package com.practice.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptions extends TestOverrideExceptio{
    /*public  void add(){
        try {
            System.out.println("inside try");
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }*/

    public static void main(String[] args) throws IOException {
        TestExceptions t = new TestExceptions();
        t.add();
    }

}

