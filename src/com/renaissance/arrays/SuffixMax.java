package com.renaissance.arrays;

import com.util.MyUtilities;

/*Find the max element starting from end of array till a given index*/
public class SuffixMax {
    public static void main(String[] args) {
        int[] inputArray = {4, 85, 15, 125, 42, 41, 14};
        int idx = 0;
        int max = getMax(inputArray, idx);
        System.out.println(max);
    }

    private static int getMax(int[] inputArray, int idx) {
        int length = inputArray.length;
        int max = inputArray[length - 1];
        for (int i = length - 1; i >= idx; i--) {
            if (i == length - 1) {
                max = inputArray[i];
            } else
                max = MyUtilities.getMax(inputArray[i], max);
        }
        return max;
    }

}
