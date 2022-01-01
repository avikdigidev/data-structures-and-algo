package com.renaissance.arrays;

import com.util.MyUtilities;

/*Find the prefix min array from a given array starting from 0 till a given index from the array*/
public class ArrayPrefixMin {
    public static void main(String[] args) {
        int[] inputArray = {4, -85, 15, -125, 42, 41, 14};
        int idx = inputArray.length;
        int max = getMin(inputArray, idx);
        System.out.println(max);
    }

    private static int getMin(int[] inputArray, int idx) {
        int min = inputArray[0];
        for (int i = 0; i < idx; i++) {
            min = MyUtilities.getMin(inputArray[i], min) ;
        }
        return min;
    }
}
