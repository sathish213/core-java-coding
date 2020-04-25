package com.practice.removeduplicates;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[]={1,1,2};
        System.out.println(removeDuplicates(nums));

    }
    private static int removeDuplicates(int[] nums) {
        int length = 1;
        for (int i=1;i<nums.length;i++){
            int count =0 ;
            for (int j=i-1; j>=0; j--){
                if (nums[i]==nums[j]){
                    count++;
                    break;
                }
            }
            if (count ==0){
                length++;
            }
        }
        return length;

    }
}
