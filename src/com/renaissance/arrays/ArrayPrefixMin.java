package com.renaissance.arrays;

import com.util.MyUtilities;

import java.util.Arrays;

/*Find the prefix min array from a given array starting from 0 till a given index from the array*/
public class ArrayPrefixMin {
    public static void main(String[] args) {
        int[] inputArray = {4, -85, 15, -125, 42, 41, 14};
        int idx = inputArray.length;
        int[] pMin = getMin(inputArray, idx);
        System.out.println(Arrays.toString(pMin));
    }

    private static int[] getMin(int[] inputArray, int n) {
        int[] pMin = new int[n];
        pMin[0] = inputArray[0];
        for (int i = 1; i < n; i++) {
            pMin[i] = Math.min(pMin[i - 1], inputArray[i]);
        }

        return pMin;
    }
}
