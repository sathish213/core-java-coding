package com.practice.search;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int arr [] = {1,3,5,7,9};
        int searchElement = 9;
        int result = linearSearch(arr, searchElement);
        if (result == -1){
            System.out.println("not found");
        }
        else
            System.out.println("found");
    }

    private static int linearSearch(int[] arr, int searchElement) {
        for (int i=0; i<arr.length;i++) {
            if (arr[i] == searchElement)
                return i;
        }
        return -1;
    }
}
