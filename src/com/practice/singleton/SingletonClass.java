package com.practice.singleton;

public class SingletonClass {
    private static SingletonClass singletonClass = null;

    private SingletonClass() {
        System.out.println("constructor");
    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            synchronized (SingletonClass.class){
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}
