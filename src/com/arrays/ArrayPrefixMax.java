package com.arrays;

import com.utilities.Utilities;

/*Find the prefix max array from a given array starting from 0 till a given index from the array*/
public class ArrayPrefixMax {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3, 56, 87};
        int idx = arr.length;
        int[] pMax = getArrayPrefixMax(arr, idx);
        for (int i = 0; i <= pMax.length - 1; i++) {
            System.out.println(pMax[i]);
        }
    }

    private static int[] getArrayPrefixMax(int[] arr, int n) {
        int[] pMax = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                pMax[i] = arr[i];
            } else {
                pMax[i] = Utilities.getMax(pMax[i - 1], arr[i]);
            }
        }
        return pMax;
    }

}
