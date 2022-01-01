package com.renaissance.arrays;

/*Find the prefix sum of a given array*/
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, -2, 5, 45, 67, 23, 10};
        int end = arr.length-1;
        int prefixSum = getPrefixSum(arr, end);
        System.out.println(" Prefix sum: " + prefixSum);
    }

    private static int getPrefixSum(int[] arr, int end) {
        int prefixSum = 0;
        for (int i = 0; i <= end; i++) {
            prefixSum = prefixSum + arr[i];
        }
        return prefixSum;
    }
}
