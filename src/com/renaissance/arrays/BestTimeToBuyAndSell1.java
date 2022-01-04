package com.renaissance.arrays;


/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock,
and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSell1 {


    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 3};
        int n = arr.length;
        int profit = 0;
        int[] sMax = getSuffixMax(arr);
        for (int i = 0; i < n - 1; i++) {
            profit = (profit > (sMax[i] - arr[i])) ? profit : (sMax[i] - arr[i]);
        }
        System.out.println(profit);
    }


    private static int[] getSuffixMax(int[] arr) {
        int sMax[] = new int[arr.length];
        int n = arr.length;
        sMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sMax[i] = (sMax[i + 1] > arr[i]) ? sMax[i + 1] : arr[i];

        }
        return sMax;
    }


}
