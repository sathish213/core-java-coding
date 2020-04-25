package com.practice.test;
//kadane's algorithm java
public class MaxmumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int element = nums[0];

        for(int x =1; x<nums.length; x++) {
            if(nums[x] > Integer.sum(element , nums[x])) {
                element = nums[x];
            } else {
                element = Integer.sum(element , nums[x]);
            }
            max = Math.max(max, element);
        }
System.out.println("max element"+max);
        return max;
    }

    public static void main(String args[]) {
        int [] a = new int[] {1, 5, -1, 0, 10};
        MaxmumSubarray m = new MaxmumSubarray();
        System.out.println(m.maxSubArray(a));
    }
}
