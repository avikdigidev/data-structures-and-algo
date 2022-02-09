package com.renaissance.maths;

/*
* Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i < j < nums.length
nums[i] + nums[j] % k ==0
* */
public class CountingPairs {
    public static void main(String[] args) {
    //    int[] arr = {2,2,1,7,5,3};
        int[] arr = {1,3,6,456,568,4,65,54,75,8};
        int k = 3;
        int result = getCountingPairsEfficiently(arr, k);
        System.out.println(result);
    }

    private static int getCountingPairsEfficiently(int[] arr, int k) {
        //Law of modularity states that: (a+b)%k = ((a%k)+ (b%k))%k
        //in other words remainders of sum = sum of remainders%k By using this...
        //and also the value of (any number %k) will lie between [0...k-1] periodically
        int ans = 0;
        int n = arr.length;
        int[] countArray = new int[k];
        for (int i = 0; i < k; i++) {
            countArray[i] = 0; //initializing the count to 0
        }
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            countArray[arr[i] % k]++; //increasing the count value at the index whenever we get the corresponding value
        }
        //considering those pairs for which arr[i]%k==0
        ans += (countArray[0] * (countArray[0] - 1)) / 2;
        //taking care of other buckets
        for (int i = 1; i <= k / 2 - 1; i++) {
            ans += countArray[i] * countArray[k - i];
        }
        //taking care of those pairs when k is either odd or even
        //when k is odd
        if (k % 2 == 0) {
            ans += (countArray[k / 2] * (countArray[k / 2] - 1)) / 2;
        } else {
            ans += countArray[k / 2] * countArray[k / 2+ 1];
        }
        return ans;
    }
}
