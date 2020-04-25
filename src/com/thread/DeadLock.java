package com.thread;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("thread executing");
        Thread.currentThread().join(10);
        System.out.println("end");
    }
}
