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
 * Constraints:
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 */
public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        System.out.println(checkHeightUsingExtraSpace(arr));
        System.out.println(heightChecker(arr));

    }

    private static int heightChecker(int[] heights) {
        int[] heightToFreq = new int[101]; // heights go from 1 to 100

        for (int height : heights) {
            heightToFreq[height]++;
        }

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }

        return result;
    }

    private static int checkHeightUsingExtraSpace(int[] arr) {
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
