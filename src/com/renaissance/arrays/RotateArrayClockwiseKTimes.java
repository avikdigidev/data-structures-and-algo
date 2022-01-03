package com.renaissance.arrays;
// Java Implementation of Right Rotation
// of an Array K number of times

import java.sql.SQLOutput;
import java.util.Arrays;

public class RotateArrayClockwiseKTimes {

    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5};
        int array2[] = {6, 2, 3, 4, 5};


        int k = 2;
        rotate(array, k);
        System.out.println(Arrays.toString(array));

    }
    public static int[] rotate(int[] nums,int k)
    {
        int n=nums.length;
        if(k > n)
            k=k%n;
        nums=reverse(nums,0,n-1);
        nums=reverse(nums,0,k-1);
        nums=reverse(nums,k,n-1);
        return nums;
    }
    public static int[] reverse(int[] nums,int start,int end)
    {

        while (start <= end ) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }

}
