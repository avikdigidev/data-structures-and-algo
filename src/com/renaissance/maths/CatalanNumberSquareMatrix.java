package com.renaissance.maths;

public class CatalanNumberSquareMatrix {
    public static void main(String[] args) {
        int n = 3;
        int totalPaths = getTotalPaths(n);
        System.out.println(totalPaths);
    }

    private static int getTotalPaths(int n) {
        int[] arr = new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i <= n ; i++) {
            arr[i]=0;
            for (int j = 0; j <= i-1; j++) {
                arr[i]+= arr[j]*arr[i-j-1];

            }
        }
        return arr[n-1];
    }
}
