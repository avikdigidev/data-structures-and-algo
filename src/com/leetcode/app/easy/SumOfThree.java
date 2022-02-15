package com.leetcode.app.easy;

import java.util.Arrays;

/*Given an array of n integers, there are 3 elements a,b and c
 * such that a+b+c=0
 * find all unique triplets in the array which gives the sum of zero*/
public class SumOfThree {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        naiveSumOfThree(arr);
    }

    private static void naiveSumOfThree(int[] arr) {
        if (arr.length == 0) return;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
                        break;
                    } else {
                        System.out.println("no triplet");
                    }
                }
            }

        }
    }
}

