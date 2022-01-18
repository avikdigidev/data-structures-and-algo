package com.renaissance.arrays;
//https://leetcode.com/problems/search-a-2d-matrix-ii/
public class SearchValueInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        boolean exists = searchMatrix(matrix, target);
        System.out.println(exists);
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //no. of columns
        int n = matrix[0].length; // no. rows

        int i = 0;
        int j = n-1;
        while (i<n && j>=0){
            int current = matrix[i][j];
            if (current == target){
                System.out.println("["+i+","+j+"]");
                return true;
            }
            else if (current> target){
                j--;

            }
            else{
                i++;
            }

        }



        return false;
    }
}
