package com.interfaces;

public interface Interface1 {

    void mul();
    default void add(){
        System.out.println("in Interface1");
    }
}
