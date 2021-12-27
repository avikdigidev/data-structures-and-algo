package com.arrays;
/*Find the min element starting from 0 till a given index from the array*/
public class PrefixMin {
    public static void main(String[] args) {
        int[] inputArray = {4, -85, 15, -125, 42, 41, 14};
        int idx = 4;
        int max = getMin(inputArray, idx);
        System.out.println(max);
    }

    private static int getMin(int[] inputArray, int idx) {
        int min = inputArray[0];
        for (int i = 0; i <= idx; i++) {
            min = (inputArray[i] < min) ? inputArray[i] : min;
        }
        return min;
    }
}
