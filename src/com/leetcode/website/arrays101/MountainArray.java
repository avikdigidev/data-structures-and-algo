package com.leetcode.website.arrays101;

/*https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
* Given an array of integers arr, return true if and only if it is a valid mountain array.
* Recall that arr is a mountain array if and only if:
* arr.length >= 3
* There exists some i with 0 < i < arr.length - 1 such that:
* arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
* arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*
Example 1:

Input: arr = [2,1]
Output: false
Example 2:

Input: arr = [3,5,5]
Output: false
Example 3:

Input: arr = [0,3,2,1]
Output: true


Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 104
*
*/
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 5, 4, 1, 2}; //[]

        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
                maxIndex++;
            }
        }

        if (maxIndex == arr.length - 1 || maxIndex == 0) {
            return false;
        }

        for (int l = 0; l < maxIndex; l++) {
            if (arr[l] >= max || arr[l] >= arr[l + 1]) {
                return false;
            }
        }

        for (int r = arr.length - 1; r > maxIndex; r--) {
            if (arr[r] >= max || arr[r] >= arr[r - 1]) {
                return false;
            }
        }

        return true;
    }
}
