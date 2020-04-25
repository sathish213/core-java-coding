package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test  {
    public static void main(String[] args) {
        Test t = new Test();
        List<comparableDemo> l = new ArrayList<>();
        comparableDemo d = new comparableDemo();
        l.add(new comparableDemo(1,"sathish","se", 100));
        l.add( new comparableDemo(2,"chinna","se", 200));
        l.add(new comparableDemo(5,"raj","se", 300));
        l.add(new comparableDemo(3,"raju","se", 50));


        Collections.sort(l);
        System.out.println(l);
        ComparatorDemo cd = new ComparatorDemo();
        Collections.sort(l,cd);
        System.out.println(l);
    }
}
