package com.renaissance.arrays;
/*Find the suffix sum array from a given array*/
public class ArraySuffixSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int idx = arr.length;
        int[] suffixSum = getSuffixSum(arr);
        for (int i = idx-1; i >= 0; i--) {
             System.out.println("Array element: "+arr[i] +". suffix sum: "+suffixSum[i]);
        }
    }

    private static int[] getSuffixSum(int[] arr) {
        int n = arr.length;
        int[] suffixSum = new int[n];
        suffixSum[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        return suffixSum;
    }
}
