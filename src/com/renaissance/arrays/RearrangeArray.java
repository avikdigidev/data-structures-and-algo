package com.renaissance.arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,0}; //{4,0,3,1,2}

        int[] swappedArr = rearrangeBruteForce(arr);

    }

    private static int[] rearrangeBruteForce(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            res[val] = i;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
