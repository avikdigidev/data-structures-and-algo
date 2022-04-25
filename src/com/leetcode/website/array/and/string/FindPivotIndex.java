package com.leetcode.website.array.and.string;

//https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 3, 2};
        System.out.println(findPivotIndex(arr, arr.length));

    }

    private static int findPivotIndex(int[] nums, int l) {
        int[] left = new int[l];
        int[] right = new int[l];
        //If the index is on the left edge of the array,
        // then the left sum is 0 because there are no elements to the left.
        // This also applies to the right edge of the array.

        left[0] = nums[0];
        right[l - 1] = nums[l - 1];

        for (int i = 1; i < l; i++) //  traverse
        {
            //Left one we sum from left to right.
            //Right one we sum from right to left.

            left[i] = nums[i] + left[i - 1];
            right[l - i - 1] = nums[l - i - 1] + right[l - i];
        }
        //The pivot index is the index in which sum of left terms is equal to the sum of right terms.
        // finally, check pivot index exist or not?
        for (int i = 0; i < l; i++)// traverse
        {
            if (left[i] == right[i]) return i; // if statement tue then it exists otherwise else statement exist.
        }
        return -1;// else statement.


    }
}



