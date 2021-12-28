package com.arrays;

import com.util.Utilities;

/*Find the max element starting from 0 till a given index from the array*/
public class PrefixMax {
    public static void main(String[] args) {
        int[] inputArray = {4, 85, 15, 125, 42, 41, 14};
        int idx = inputArray.length-1;
        int max = getMax(inputArray, idx);
        System.out.println(max);
    }

    private static int getMax(int[] inputArray, int idx) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= idx; i++) {
            max = Utilities.getMax(inputArray[i] , max);
        }
        return max;
    }
}
