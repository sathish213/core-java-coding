package com.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample extends Thread {
    private int value;
    List<String> list;
    public ThreadExample(int value, List<String> list){
        System.out.println("value: "+value);
        this.value = value;
        this.list = list;
    }
    public void run(){
        value++;
        String name = Thread.currentThread().getName();
        System.out.println("thread is running..."+Thread.currentThread().getName() + " " + value);
        synchronized (list) {
            for (int i = 0; i < 5; i++) {
                System.out.println("i value " + i);
                list.add(name + " " + list.size());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        List<String> list = new ArrayList<>();
        ThreadExample t = new ThreadExample(count, list);
        t.start();

        ThreadExample t2 = new ThreadExample(count, list);
        t2.start();
        t.join();
        t2.join();
        list.stream().forEach(v -> System.out.println(v));
    }
}
