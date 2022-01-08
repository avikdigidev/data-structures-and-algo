package com.renaissance.arrays;


import com.util.MyUtilities;

/*Find the suffix max array from a given array starting from end of the array*/
public class ArraySuffixMax {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        int n = arr.length;
        int[] sMax = getArraySuffixMax(arr, n);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(sMax[i]);
        }
    }

    private static int[] getArraySuffixMax(int[] arr, int n) {
        int sMax[] = new int[n];
        sMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
                sMax[i] = MyUtilities.getMax(sMax[i + 1], arr[i]);
        }
        return sMax;
    }


}
