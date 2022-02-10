package com.renaissance.maths;

public class CountingTriplets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int m = 8;
        int count = getCountOfTripletsBruteForce(arr, m); //O(N^3)
        System.out.println(count);
    }

    private static int getCountOfTripletsBruteForce(int[] arr, int m) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((arr[i] + arr[j] + arr[k]) % m == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
