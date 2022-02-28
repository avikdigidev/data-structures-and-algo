package com.leetcode.website.arrays101;

import java.util.Arrays;
//https://leetcode.com/problems/move-zeroes/

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int[] result = moveZerosWithExtraSpace(arr);

        moveZeros(arr);

        moveZerosEfficiently(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }

    private static void moveZerosEfficiently(int[] arr) {
                /*
          Space Complexity : O(1).
          Only constant space is used.
          Time Complexity: O(n).
          However, the total number of operations are optimal.
          The total operations (array writes) that code does is Number of non-0 elements.
          This gives us a much better best-case (when most of the elements are 0) complexity than last solution.
          However, the worst-case (when all elements are non-0) complexity for both the algorithms is same.

          */
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < arr.length; cur++) {
            if (arr[cur] != 0) {
                int x = arr[lastNonZeroFoundAt];
                arr[lastNonZeroFoundAt] = arr[cur];
                arr[cur] = x;
                lastNonZeroFoundAt++;
            }
        }
    }

    private static void moveZeros(int[] arr) {
                /*
        Space Complexity : O(1). Only constant space is used.
        Time Complexity: O(n)O(n).
        However, the total number of operations are still sub-optimal.
        The total operations (array writes) that code does is nn (Total number of elements).
        */

        if (arr == null || arr.length < 2) {
            return;
        }

        int zeroIdx = 0;
        // If the current element is not 0, then we need to
        // append it just in front of last non 0 element we found.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[zeroIdx++] = arr[i];
            }
        }
        // After we have finished processing new elements,
        // all the non-zero elements are already at beginning of array.
        // We just need to fill remaining array with 0's.
        for (int i = zeroIdx; i < arr.length; i++) {
            arr[i] = 0;
        }

    }

    private static int[] moveZerosWithExtraSpace(int[] arr) {
                /*
        Space Complexity : O(n).
        Since we are creating the "result" array to store results.
        Time Complexity: O(n).
        However, the total number of operations are sub-optimal.
        We can achieve the same result in less number of operations.*/

        if (arr == null || arr.length < 2) {
            return arr;
        }

        int[] result = new int[arr.length];
        int j = 0;
        for (int k : arr) {
            if (k != 0) {
                result[j] = k;
                j++;
            }
        }

        return result;
    }
}
