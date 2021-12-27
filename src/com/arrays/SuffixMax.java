package com.arrays;
/*Find the max element starting from end of array till a given index from the array*/
public class SuffixMax {
    public static void main(String[] args) {
        int[] inputArray = {4, 85, 15, 125, 42, 41, 14};
        int idx = 4;
        int max = getMax(inputArray, idx);
        System.out.println(max);
    }

    private static int getMax(int[] inputArray, int idx) {
        int length = inputArray.length;
        int max = inputArray[length-1];
        for (int i = length-2; i >=idx ; i--) {
            max = (inputArray[i] > max) ? inputArray[i] : max;
        }


        return max;
    }


}
