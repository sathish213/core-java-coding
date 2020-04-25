package com.practice.memory;

public class TestMemory {
    static  int i = 0;

    public static void main(String[] args) {
        /*if (i < 30) {
            i++;
            System.out.println(i);
            main(new String[] { (args[0] + args[0]).intern() });
        }*/

        for (int i = 0; true; ++i) {
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch(InterruptedException e) { }
                }
            }.start();
            System.out.println("Thread " + i + " created");
        }
    }
}
