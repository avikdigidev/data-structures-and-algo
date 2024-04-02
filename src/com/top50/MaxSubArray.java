package com.top50;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -6, 4, 2, -8, 3};
        System.out.println(maximumSubarray(arr));
    }

    public static int maximumSubarray(int[] arr) {
        int localSum = 0;
        int globalSum = Integer.MIN_VALUE;
        for (int element : arr) {
            localSum = Math.max(element, localSum + element);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
    }
}
