package com.interview.test;

import java.util.Arrays;

public class MSys {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 17, 8, 6, 7};
        int n = arr.length;
        int[] minMax = getMinMax(arr, n);
        System.out.println(Arrays.toString(minMax));
    }

    private static int[] getMinMax(int[] arr, int n) {
        int min = arr[0];
        int max = Integer.MIN_VALUE;
        int[] result = new int[2];
        //0 min
        //1 max
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        result[0] = min;
        result[1] = max;
        return result;
    }
}
