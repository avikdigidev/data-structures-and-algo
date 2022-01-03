package com.renaissance.arrays;

public class HeightOfNPillars {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 3, 0, 2,8,5,7};
        int n = arr.length;
        int trappedWater = 0;
        int[] pMax = getArrayPrefixMax(arr, n);
        int[] sMax = getArraySuffixMax(arr, n);

        for (int i = 1; i < n - 1; i++) {
            int d = Math.min(pMax[i], sMax[i]);
            if (d > arr[i]) {
                trappedWater += d - arr[i];
            }
        }
        System.out.println(trappedWater);
    }


    private static int[] getArrayPrefixMax(int[] arr, int n) {
        int[] pMax = new int[n];
        pMax[0] = arr[0];
        for (int i = 1; i < n-1; i++) {
                pMax[i] = (pMax[i - 1]> arr[i])? pMax[i-1] : arr[i] ;
        }
        return pMax;
    }

    private static int[] getArraySuffixMax(int[] arr, int n) {
        int sMax[] = new int[n];
        sMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
                sMax[i] = (sMax[i + 1]> arr[i])? sMax[i + 1] : arr[i] ;
        }
        return sMax;
    }
}
