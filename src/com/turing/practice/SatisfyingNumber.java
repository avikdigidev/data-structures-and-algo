package com.turing.practice;

public class SatisfyingNumber {
    public static void main(String[] args) {
        int[] arr = {34, 23, 1, 24, 75, 33, 54, 8};
        int[] arr2 = {10, 20, 30};

        int k = 60;
        int result = getSatisfyingNumber(arr, k);
        System.out.println(result);
        int k2 = 50;
        int result2 = getSatisfyingNumber(arr2, k2);
        System.out.println(result2);
    }

    private static int getSatisfyingNumber(int[] arr, int k) {
        int sum = -1;
        int currentSum;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                currentSum = arr[i] + arr[j];
                if (currentSum < k && currentSum > sum) {
                    sum = currentSum;
                }

            }
        }
        return sum;
    }
}
