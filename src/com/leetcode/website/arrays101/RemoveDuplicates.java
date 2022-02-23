package com.leetcode.website.arrays101;
//
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,4,4,5};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
