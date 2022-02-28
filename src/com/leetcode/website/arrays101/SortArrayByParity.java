package com.leetcode.website.arrays101;

import java.util.Arrays;

/*
 * https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
 * Given an integer array nums,
 * move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 * Constraints:
 * 1 <= nums.length <= 5000
 * 0 <= nums[i] <= 5000
 *
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1};
        arr = sortEven(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortEven(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int even = 0;
        int current = 0;
        while (current < arr.length) {
            if (arr[current] % 2 == 0) {
                int x = arr[even];
                arr[even] = arr[current];
                arr[current] = x;
                even++;
                current++;
            } else {
                current++;
            }
        }
        return arr;
    }
}
