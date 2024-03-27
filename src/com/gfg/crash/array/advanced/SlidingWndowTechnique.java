package com.gfg.crash.array.advanced;

public class SlidingWndowTechnique {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = {1, 8, 30, -5, 20, 7};
        int k = 4;
        int maxSum = getMaxSum(arr, k); // get max sum of k size sub array
        System.out.println(maxSum);
    }

    private static int getMaxSum(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int cSum = sum;
        for (int i = 1; i + k - 1 < n; i++) {
            cSum = cSum - arr[i - 1] + arr[i + k - 1];
            sum = Math.max(sum, cSum);
        }
        return sum;
    }
}
