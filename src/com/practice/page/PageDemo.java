package com.practice.page;

public class PageDemo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] results = currentPage(5,10,arr);
        for (int i=0; i< results.length; i++){
            System.out.print(results[i]);
        }
        
    }

    private static int[] currentPage(int n, int click, int [] arr) {
        int active = click%n == 0 ? n : click%n;
        int prev = arr[0];
        arr[0] = arr[active-1];
        int next;
        for (int i =1; i<active; i++) {
            System.out.println("arr[i]"+arr[i]);
            next = arr[i];
            arr[i] = prev;
            prev = next;
        }
        return arr;
    }
}
