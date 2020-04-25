package com.practice.stockbuysell;

import java.util.ArrayList;
import java.util.List;

public class StockBuySell {
    public static void main(String[] args) {
        int buy,sell;
        int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
        stockBuySell(arr, arr.length);
    }

    private static void stockBuySell(int[] arr, int length) {
        if (length == 1){
            return ;
        }

        List<Interval> l = new ArrayList<>();

        int[] buy = new int[10];
        int[] sell = new int[10];
        int count = 0;
        int i = 0;
        while (i < length-1){
            while ((i<length-1) && (arr[i]>= arr[i+1])){
                i++;
            }

            if (i == length-1){
                return;
            }
            Interval inter = new Interval();
            System.out.println("buy"+i);
            inter.buy = i++;

            while ((i<length) && (arr[i] >= arr[i-1])) {
                i++;
            }

            System.out.println("sell"+i);
            inter.sell = i-1;

            l.add(inter);

            count++;
        }
        System.out.println(count);
        for (int j = 0; j < count; j++) {
            System.out.println(l.get(j).buy + " "+l.get(j).sell);
        }
    }
}
