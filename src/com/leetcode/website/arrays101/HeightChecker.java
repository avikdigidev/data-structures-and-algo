package com.leetcode.website.arrays101;

import java.util.Arrays;

/*https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
 * A school is trying to take an annual photo of all the students.
 * The students are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where
 * expected[i] is the expected height of the ith student in line.
 * You are given an integer array heights representing the current order that the students are standing in.
 * Each heights[i] is the height of the ith student in line (0-indexed).
 * Return the number of indices where: heights[i] != expected[i].
 */
public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        System.out.println(checkheight(arr));

    }

    private static int checkheight(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int a : arr) {
            temp[j] = a;
            j++;
        }
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[i]) {
                count++;
            }
        }
        return count;
    }
}
