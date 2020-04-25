package com.practice.exam;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(7);

        System.out.println(maxDiff(a));

    }

    public static int maxDiff(List<Integer> a) {
        int max_diff = Integer.MIN_VALUE;
        int i, j;
        int size = a.size();
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (a.get(i) < a.get(j) &&a.get(j) - a.get(i) > max_diff)
                    max_diff = a.get(j) - a.get(i);
            }
        }
        return max_diff == Integer.MIN_VALUE ? -1 : max_diff;
    }
}
