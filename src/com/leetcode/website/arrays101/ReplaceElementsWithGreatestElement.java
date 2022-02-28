package com.leetcode.website.arrays101;

import java.util.Arrays;
/*https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/
Given an array arr,
replace every element in that array with the greatest element among the elements to its right,
and replace the last element with -1.
After doing so, return the array.

Example 1:
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]
Explanation:
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.

Example 2:
Input: arr = [400]
Output: [-1]
Explanation: There are no elements to the right of index 0.

Constraints:
1 <= arr.length <= 104
1 <= arr[i] <= 105
*/
public class ReplaceElementsWithGreatestElement {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr))); //Expected: [18,6,6,6,1,-1]
    }

    private static int[] replaceElements(int[] arr) {
        for (int i = 0; i <=arr.length - 2 ; i++) {
            int max = getMax(arr, i);
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    private static int getMax(int[] arr, int start) {
        int max = Integer.MIN_VALUE;
        for (int j = arr.length-1; j > start; j--) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }
}
