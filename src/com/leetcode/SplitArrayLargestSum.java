package com.leetcode;

//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }

    public static int splitArray(int[] nums, int m) {
        int ans = 0;
        int[] prefixSum = pSum(nums);
        int[] suffixSum = sSum(nums);
boolean[] splitInd = getSplits(prefixSum,suffixSum);
        getIndex(prefixSum,suffixSum,splitInd,m);
        return ans;
    }
private static int[] getIndex(int[] prefixSum, int[] suffixSum, boolean[] splitInd, int m){
        int[] indices = new int[m];
        int i =0;
        while(!splitInd[i]){

            i++;
        }
        int a = suffixSum[i];
        int b = prefixSum[i-1];
//TODO:  store the indexes in the array

        return null;
}
    private static boolean[] getSplits(int[] prefixSum, int[] suffixSum) {
        boolean[] res = new boolean[prefixSum.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = prefixSum[i] > suffixSum[i];
        }
        return res;
    }

    public static int[] pSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i <= arr.length-1; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static int[] sSum(int[] arr) {
        int n = arr.length;
        int[] suffixSum = new int[n];
        suffixSum[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        return suffixSum;
    }
}
