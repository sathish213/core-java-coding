package com.thread;

public class Thread1 extends Thread {
    public void run() {
        synchronized (Thread1.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println("thread1: " + i);
            }
        }
    }
}
