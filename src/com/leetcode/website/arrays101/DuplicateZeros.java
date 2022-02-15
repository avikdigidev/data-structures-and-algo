package com.leetcode.website.arrays101;

import java.util.Arrays;

//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
/*Given a fixed-length integer array arr, duplicate each occurrence of zero,
shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place and do not return anything.
*/
public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3};
        duplicateZeros(arr);//expected: 1,0,0,2
        System.out.println(Arrays.toString(arr));

    }

    private static void duplicateZeros(int[] arr) {
  /*
  O(n) runtime
  O(1) space

        First pass to count the number of 0's.
        Second pass is to write in the values in appropriate locations,
        moving from right to left (backwards from the usual),
        in which the write pointer initially extends outside the length of the array
        (as if it was the full sized array without erasing values in the shift).
   */
        //getting the count of 0 in array
  
        int n = arr.length, count = 0;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        int i = n - 1;
        int write = n + count - 1;

        while (i >= 0 && write >= 0) {
            if (arr[i] != 0) { // Non-zero, just write it in
                if (write < n) arr[write] = arr[i];
            } else { // Zero found, write it in twice if we can
                if (write < n) arr[write] = arr[i];
                write--;
                if (write < n) arr[write] = arr[i];
            }
            i--;
            write--;
        }
    }

}

