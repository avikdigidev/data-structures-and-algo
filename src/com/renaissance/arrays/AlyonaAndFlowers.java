package com.renaissance.arrays;

import java.util.Scanner;
//problem: https://codeforces.com/problemset/problem/740/B
public class AlyonaAndFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt(); //O(n)
        }
        //1 -2 1 3 -4
        int sum = 0;
        for (int i = 0; i < m; i++) { //O(m*n)
            int l = sc.nextInt();
            int r = sc.nextInt();
            int cSum =0;
            for (int j = l-1; j <= r-1; j++) {

                cSum += arr[j];
            }
            if(cSum>0) sum = sum + cSum;

        }
        System.out.println(sum);
    }
}
