package com.arrays;
/*Find the prefix sum of a given array*/
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {10, 4, 16, 1, -20, 23, 45, 67, 23, 10};
        int end = 5;

        int[] prefixSum = getPrefixSum(arr,  end);
        for (int i = 0; i < prefixSum.length; i++) {
             System.out.println("Array element: "+arr[i] +". Prefix sum: "+prefixSum[i]);
        }
    }

    private static int[] getPrefixSum(int[] arr, int end) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
}
