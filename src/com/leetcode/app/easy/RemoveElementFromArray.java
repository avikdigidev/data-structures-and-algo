package com.leetcode.app.easy;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6,4,3};
        int val = 4;
        int result = removeElement(nums,val);
        System.out.println(result);
    }

    private static int removeElement(int[] nums, int val) {
        int i =0;
        int n=nums.length;
        while(i<n){
            if (nums[i]==val){
                nums[i]= nums[n-1];
                //reduce array size by one
                n--;
            }else{
                i++;
            }
        }
        return n;
    }
}
