package com.thread;

public class Thread2 extends Thread {

    public void run() {
        synchronized (Thread1.class) {
            for (int i = 5; i < 10; i++) {
                System.out.println("thread 2" + i);
            }
        }
    }
}
