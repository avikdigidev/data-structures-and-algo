package com.renaissance.maths;

public class CatalanNumbers {
    public static void main(String[] args) {
        //total n pairs of balanced parenthesis
        int n = 3;
        long count = getCatalanNumbers(n);
        System.out.println(count);
    }

    private static long getCatalanNumbers(int n) {
        long[] countArray = new long[n + 1];
        countArray[0] = 1; //no pair of bracket is also considered balanced
        countArray[1] = 1; // 1 pair will be balanced only ()
        for (int i = 2; i <= n; i++) {
            countArray[i] = 0;
            for (int j = 0; j <= i - 1; j++) {
                countArray[i] += countArray[j] * countArray[i - j - 1];
            }

        }
        return countArray[n-1];
    }
}
