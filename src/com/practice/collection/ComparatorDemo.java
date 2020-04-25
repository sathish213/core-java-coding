package com.practice.collection;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<comparableDemo> {
    @Override
    public int compare(comparableDemo o1, comparableDemo o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        }else
            return 0;
    }
}
