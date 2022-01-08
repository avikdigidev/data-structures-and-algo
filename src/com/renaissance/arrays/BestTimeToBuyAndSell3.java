package com.renaissance.arrays;


/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
You are given an array prices where prices[i] is the price of a given stock on the ith day.
Find the maximum profit you can achieve.
You may complete at most two transactions.
Note: You may not engage in multiple transactions simultaneously
(i.e., you must sell the stock before you buy again)
 */
public class BestTimeToBuyAndSell3 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int [] arr2 = {5,4,3,2,1};
        int profit = getProfitMax(arr);
        System.out.println(profit);
        int profit2 = getProfitMax(arr2);
        System.out.println(profit2);
    }


    public static int getProfitMax(int[] prices) {
        int n = prices.length;
        //compute the prefixMin so that we know to buy at lowest price
        int[] pMin = new int[n];
        pMin[0] = prices[0];
        for (int i = 1; i < n; i++) {
            pMin[i] = Math.min(pMin[i - 1], prices[i]);
        }

        //compute the prefix profit array
        int[] pProfit = new int[n];
        pProfit[0] = 0;
        for (int i = 1; i < n; i++) {
            int newProfit = prices[i] - pMin[i - 1];
            pProfit[i] = Math.max(pProfit[i - 1], newProfit);
        }

        //compute the suffixMax array
        int[] sMax = new int[n];
        sMax[n - 1] = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sMax[i] = Math.max(sMax[i + 1], prices[i]);
        }
        // computing the suffixProfit array
        int[] sProfit = new int[n];
        sProfit[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            int newProfit = sMax[i + 1] - prices[i];
            sProfit[i] = Math.max(sProfit[i + 1], newProfit);
        }
        //find the barrier to divide the array in to 2 sub-arrays and complete
        // the transaction to get max profit
        int maxProfit = sProfit[0];
        for (int i = 1; i < n; i++) {
            int profitWithTwoTransactions = pProfit[i - 1] + sProfit[i];
            maxProfit = Math.max(profitWithTwoTransactions, maxProfit);
        }
        return maxProfit;
    }


}
