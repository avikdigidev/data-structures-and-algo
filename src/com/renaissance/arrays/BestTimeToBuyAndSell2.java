package com.renaissance.arrays;


/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
On each day, you may decide to buy and/or sell the stock.
You can only hold at most one share of the stock at any time.
However, you can buy it then immediately sell it on the same day.
Find and return the maximum profit you can achieve.
 */
public class BestTimeToBuyAndSell2 {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int profit = getProfitMax(arr);
        System.out.println(profit);
    }


    private static int getProfitMax(int[] arr) {
        int n = arr.length;
        int profit = 0;
        for (int i = 1; i <= n - 1; i++) {
            if(arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }


}
