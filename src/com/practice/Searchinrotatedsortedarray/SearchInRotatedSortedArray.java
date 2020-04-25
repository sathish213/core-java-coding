package com.practice.Searchinrotatedsortedarray;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2 ,4 ,5,6,7};
        //System.out.println(linearSearch(nums, 7));
        System.out.println(pivotedBinarySearch(nums, 5));
    }

    private static int linearSearch(int [] nums, int searchElement) {
        for (int i=0; i<nums.length; i++){
            if (nums[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    private static int pivotedBinarySearch(int [] nums, int searchElement) {
        int l = nums.length;
        int pivot = findPivot(nums, 0, l-1);
        System.out.println("pivot"+pivot);

        if (pivot == -1){
            return binarySearch(nums, 0, l-1, searchElement);
        }

        if (nums[pivot] == searchElement){
            return pivot;
        }
        if (nums[0] <= searchElement)
            return binarySearch(nums, 0, pivot-1, searchElement);
        return binarySearch(nums, pivot+1, l-1, searchElement);
    }

    private static int findPivot(int[] nums, int low, int high) {
        if(high < low){
            return -1;
        }
        if (high == low){
            return low;
        }

        int mid = (low + high)/2;
        if (mid<high && nums[mid]> nums[mid+1]){
            return mid;
        }
        if (mid> low && nums[mid]< nums[mid-1]){
            return mid-1;
        }
        if (nums[low] >= nums[high]){
            findPivot(nums, low, mid-1);
        }

        return findPivot(nums, mid+1, high);
    }

    private static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;

        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid -1), key);
    }
}
