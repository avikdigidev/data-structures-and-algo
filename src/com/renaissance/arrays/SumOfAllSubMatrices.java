package com.renaissance.arrays;

public class SumOfAllSubMatrices {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] m2 = {{1,1},{1,1}};
        int sum = getSumOfAllMatrices(m2);
        System.out.println(sum);


    }

    private static int getSumOfAllMatrices(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum+= matrix[i][j]*(i+1)*(j+1)*(n-i)*(n-j);
            }
        }
        return sum;
    }
}
