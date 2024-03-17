package com.scalar.arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20},{99,88,77,66,55}};
        spiralMatrix(arr);
    }

    private static void spiralMatrix(int[][] arr) {
        int capacity = arr.length*arr[0].length;
        int total =1;
        int rmin = 0, cmin = 0, rmax = arr.length-1, cmax = arr[0].length-1;
        while(total<capacity){

            for (int i = 0; i <= cmax; i++) {
                System.out.println(arr[rmin][i]);
                total++;
            }
            rmin++;
            for (int i = rmin; i <= rmax; i++) {
                System.out.println(arr[i][cmax]);
                total++;
            }
            cmax--;
            for (int i = cmax; i >=cmin ; i--) {
                System.out.println(arr[rmax][i]);
                total++;
            }
            rmax--;
            for (int i = rmax; i >=rmin ; i--) {
                System.out.println(arr[i][cmin]);
                total++;
            }
            cmin++;
        }
        if(arr.length== arr[0].length){
            System.out.println(arr[arr.length/2][arr.length/2]);
        }
        System.out.println();
        }

}
