package com.renaissance.arrays;

import java.util.Arrays;

public class RotateMatrixClockwise {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
    }
    public static void rotate(int[][] arr) {
        //transposing the matrix
        /*
        1 2 3
        4 5 6
        7 8 9*/
        for(int i = 0; i<arr.length;i++){
            for(int j = i; j<arr.length;j++){
                System.out.println(i+ " "+ j);
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        /* Now the matrix becomes
        1 4 7
        2 5 8
        3 6 9
        */
        //reversing every row of the matrix
        for(int i =0; i <arr.length;i++){
            int leftIndex = 0;
            int rightIndex = arr[i].length - 1;
            while(leftIndex< rightIndex){
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }

        /*Result
        7 4 1
        8 5 2
        9 6 3
        */
    }
}
