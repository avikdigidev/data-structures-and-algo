package com.leetcode.website.arrays101;

/*
https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
Check If N and Its Double Exist
Given an array arr of integers,
check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
More formally check if there exists two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

Example:
Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
*/
public class CheckIfNAndItsDoubleExists {
    public static void main(String[] args) {
        int[] arr = {-20, 8, -6, -14, 0, -19, 14, 4};
        System.out.println("If the element exists? " + checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
