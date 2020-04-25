package com.practice.exam;

public class Power {
    public static void main(String[] args) {
        int [] nums = {-5, 4, -2, 3, 1, -1, -6, -1, 0, -5};
        int [] nums1 = {-5, 4, -2, 3, 1 };
        int [] nums2 ={-77};
        System.out.println(power(nums2));
    }

    private static int power(int [] nums){
        int powerValue = 0;
        if(nums[0] < 0){
            powerValue = Math.abs(nums[0]) + 1;

        }

        int temp = powerValue;
        for (int i=0; i<nums.length;i++){
            temp = temp + nums[i];
            if (temp < 1){
                powerValue = powerValue + Math.abs(temp) + 1;
                temp = Math.abs(temp) + 1;
            }
        }
        return powerValue;
    }
}
