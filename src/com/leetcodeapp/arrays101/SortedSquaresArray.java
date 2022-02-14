package com.leetcodeapp.arrays101;

import java.util.Arrays;

//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
public class SortedSquaresArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int x = 0;
        int y = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[x]) > Math.abs(nums[y])) {
                result[i] = nums[x] * nums[x];
                x++;
            } else {
                result[i] = nums[y] * nums[y];
                y--;
            }
        }
        return result;
    }
}
