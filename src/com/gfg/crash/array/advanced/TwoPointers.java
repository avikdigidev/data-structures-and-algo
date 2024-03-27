package com.gfg.crash.array.advanced;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {-15,1, 2, 3, 4, 5};
        squareArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void squareArray(int[] arr) {
        int start = 0, n = arr.length, end = n - 1;
        int[] result = new int[n];
        for (int i = end; i >= 0; i--) {

            if (Math.abs(arr[start]) > arr[end]) {
                result[i] = arr[start] * arr[start];
                start++;
            } else {
                result[i] = arr[end] * arr[end];
                end--;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
}
