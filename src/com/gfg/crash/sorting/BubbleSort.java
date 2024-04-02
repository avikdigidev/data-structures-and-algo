package com.gfg.crash.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 3, 5, 8, 1};
        int n = arr.length - 1;
        bubbleSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n) {
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = i + 1; j <= n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }
            if (swapped == false) {
                break;
            }
        }
    }
}
