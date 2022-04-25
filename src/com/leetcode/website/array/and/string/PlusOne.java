package com.leetcode.website.array.and.string;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9};
        int[] res = plusOne(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] plusOne(int[] arr) {
        int rem = 0;
        arr[arr.length - 1]++;
        for(int i = arr.length - 1; i >= 0; i--) {
            arr[i] += rem;
            if(arr[i] > 9) {
                rem = 1;
                arr[i] %= 10;
            } else {
                rem = 0;
            }
        }

        if (rem==1){
            arr = new int [arr.length+1];
            arr[0] = 1;
        }
        return arr;
    }
}
