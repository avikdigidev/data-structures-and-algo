package com.arrays;
/*Find the prefix sum array from a given array*/
public class ArrayPrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, -2, 5, 45, 67, 23, 10};
        int[] prefixSum = getPrefixSum(arr);
        for (int i = 0; i < prefixSum.length; i++) {
             System.out.println("Array element: "+arr[i] +". Prefix sum: "+prefixSum[i]);
        }
    }

    private static int[] getPrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i <= arr.length-1; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
}
