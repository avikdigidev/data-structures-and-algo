package com.renaissance.arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        int sum=0;
        for (int i = 0; i <= k-1; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

        // this loop can also be done right, instead of the last one as suggested in video?
        for (int i = 1; i <= (n-k); i++) {
            sum = sum - arr[i-1] + arr[i+k-1];
            System.out.println(sum);
        }
        for (int i = k; i <= n-1; i++) {
            sum += arr[i];
            sum -= arr[i-k];
            System.out.println(sum);
        }


    }
}
