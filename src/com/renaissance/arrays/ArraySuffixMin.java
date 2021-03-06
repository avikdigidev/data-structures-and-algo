package com.renaissance.arrays;


import com.util.MyUtilities;

/*Find the suffix max array from a given array starting from end of the array*/
public class ArraySuffixMin {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        int n = arr.length;
        int[] sMax = getArraySuffixMin(arr, n);
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(sMax[i]);
        }
    }

    private static int[] getArraySuffixMin(int[] arr, int n) {
        int sMax[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                sMax[i] = arr[i];
            } else {
                sMax[i] = MyUtilities.getMin(sMax[i + 1], arr[i]);
            }
        }
        return sMax;
    }


}
