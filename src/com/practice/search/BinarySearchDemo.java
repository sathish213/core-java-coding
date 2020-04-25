package com.practice.search;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int arr [] = {1,3,5,7,9};
        int searchElement = 0;
        int resultValue = binarySearch(arr, 0, arr.length, searchElement);
        if (resultValue == -1) {
            System.out.println("not found");
        }
        else {
            System.out.println("found");
        }
    }

    private static int binarySearch(int[] arr, int first, int last, int searchElement) {
        if (last>first) {
            System.out.println("first: " +first+" "+"last: "+ last);
            int mid = (first + (last-1))/2;
            System.out.println("mid "+mid);
            if (arr[mid] == searchElement) {
                return mid;
            }
            if (arr[mid] > searchElement) {
                return binarySearch(arr,first,mid-1,searchElement);
            }
            return binarySearch(arr,mid+1,last,searchElement);
        }
        return -1;
    }
}
