package com.renaissance.arrays;

import java.util.Arrays;
import java.util.Collections;
//https://leetcode.com/problems/maximum-product-subarray/
public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,3,-4};
        int res =maxProduct(arr);
        int res2 = alternateMaxProduct(arr);
        System.out.println(res2);
        System.out.println(res);
    }

    private static int alternateMaxProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            temp *=arr[i];
            max = Math.max(max,temp);
            if (temp==0) temp=1;
        }
        temp=1;
        for (int i = arr.length-1; i >=0 ; i--) {
            temp *=arr[i];
            max = Math.max(max,temp);
            if (temp==0) temp=1;
        }
        return max;

    }

    public static int maxProduct(int[] nums) {

        int n=nums.length;
        int[]max=new int[n];
        int[]min=new int[n];
        max[0]=nums[0];
        min[0]=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            int one=max[i-1]*nums[i];
            int two=min[i-1]*nums[i];
            max[i]=Math.max(one,Math.max(two,nums[i]));
            min[i]=Math.min(one,Math.min(two,nums[i]));
            ans=Math.max(ans,max[i]);
        }
        return ans;
    }
}
