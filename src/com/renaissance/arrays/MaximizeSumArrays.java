package com.renaissance.arrays;

import com.util.MyUtilities;


import java.util.Scanner;

public class MaximizeSumArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a,b,c; //int a=2;  int b =4; int c= 6;
        System.out.println("Enter the size of desire array: ");
        n = sc.nextInt();
        int[] arr = new int[n]; //{1,5,2,3,4}

        System.out.println("Enter the first multiplier: ");
        a = sc.nextInt();
        System.out.println("Enter the second multiplier: ");
        b = sc.nextInt();
        System.out.println("Enter the third multiplier: ");
        c = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+ ",");
        }


        // we need to maximize sum of (a*arr[i]+ b*arr[j] + c*arr[k]) given that i<j<k
        // first we will fix the middle term such that the array is divided into 2 parts one for i and other for k
        int[] prefixMax = getPrefixMax(arr, n, a);
        int[] suffixMax = getSuffixMax(arr, n, c);
        int ans = Integer.MIN_VALUE;
        /*
         *  TO MAKE THIS PROBLEM WIH CONDITION i<=j<=k, use the below commented loop:
         * for (int y = 0; y <= n - 1; y++) {
         * int first = prefixMax[y];
         * int mid = b * arr[y];
         * int last = suffixMax[y];
         *
         */
        for (int y = 1; y <= n - 2; y++) {

            int first = prefixMax[y-1];
            int mid = b * arr[y];
            int last = suffixMax[y+1];
            ans = Integer.max(ans, first + mid + last);
            System.out.println("First: " + first);
            System.out.println("Second: " + mid );
            System.out.println("Third: " + last );
            System.out.println("Result of " + (y + 1) + " iteration : " + ans);
        }
        System.out.print("Max sum possible is " + ans);
    }

    private static int[] getSuffixMax(int[] arr, int n, int c) {
        int sMax[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                sMax[i] = c * arr[i];
            } else {
                sMax[i] = MyUtilities.getMax(sMax[i + 1], c * arr[i]);
            }
        }
        return sMax;
    }

    private static int[] getPrefixMax(int[] arr, int n, int a) {
        int[] pMax = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                pMax[i] = a * arr[i];
            } else {
                pMax[i] = MyUtilities.getMax(pMax[i - 1], a * arr[i]);
            }
        }
        return pMax;
    }
}
