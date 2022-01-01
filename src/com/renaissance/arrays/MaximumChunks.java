package com.renaissance.arrays;

import com.util.MyUtilities;

public class MaximumChunks {
    public static void main(String[] args) {
        int[] inputArray = {4, 2, 0, 3, 1, 5, 6};
        int idx = inputArray.length;
        int currentMax = Integer.MIN_VALUE;
        int totalChunks = 0;
        for (int i = 0; i < idx; i++) {
            currentMax = MyUtilities.getMax(inputArray[i], currentMax);
            if (currentMax == i) {
                totalChunks++;
            }
        }
        System.out.println(totalChunks);
    }

}
