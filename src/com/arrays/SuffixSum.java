package com.arrays;

/*Find the suffix sum of a given array*/
public class SuffixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, -2, 5, 45, 67, 23, 10};
        int end = 8;
        int suffixSum = getSuffixSum(arr, end);
        System.out.println(" Suffix sum: " + suffixSum);
    }

    private static int getSuffixSum(int[] arr, int end) {

        int n = arr.length;
        int suffixSum = arr[n-1];
        for (int i = n-2; i >= end; i--) {
            suffixSum = suffixSum + arr[i];
        }
        return suffixSum;
    }
}
