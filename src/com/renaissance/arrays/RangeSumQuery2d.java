package com.renaissance.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/range-sum-query-2d-immutable/
public class RangeSumQuery2d {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /*1 2 3
         * 4 5 6
         * 7 8 9
         *
         * */
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    matrix[i][j] += 0;
                } else if (i == 0) {
                    matrix[i][j] = matrix[i][j] + matrix[i][j - 1];
                } else if (j == 0) {
                    matrix[i][j] = matrix[i][j] + matrix[i - 1][j];
                } else {
                    matrix[i][j] = matrix[i][j] + matrix[i][j - 1] + matrix[i - 1][j] - matrix[i - 1][j - 1];
                }
            }
        }

        int res = sumRegion(matrix, 0, 1, 1, 2);
        System.out.println(res);

    }

    public static int sumRegion(int[][] matrix, int r1, int c1, int r2, int c2) {
        if (r1 == 0 && c1 == 0) {
            return matrix[r2][c2];
        } else if (r1 == 0) {
            return matrix[r2][c2] - matrix[r2][c1 - 1];
        } else if (c1 == 0) {
            return matrix[r2][c2] - matrix[r1 - 1][c2];
        } else {
            return matrix[r2][c2] - matrix[r2][c1 - 1] - matrix[r1 - 1][c2] + matrix[r1 - 1][c1 - 1];
        }
    }
}
