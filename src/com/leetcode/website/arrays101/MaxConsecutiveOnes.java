package com.leetcode.website.arrays101;
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1};
        int result = getMaxConsecutiveOnes(arr);
        System.out.println(result);
    }

    private static int getMaxConsecutiveOnes(int[] arr) {
        int result = 0, count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                result = Math.max(count, result);
            } else {
                count = 0;
            }

        }
        return result;
    }
}
