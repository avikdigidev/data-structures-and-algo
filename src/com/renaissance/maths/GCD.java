package com.renaissance.maths;

public class GCD {
    public static void main(String[] args) {
        int a = 0, b = 12;
        int gcd = getEuclidsGCD(a, b); //Runtime efficiency = O(log2(max(a,b))
        System.out.println(gcd);
        int bfgcd = getBruteForceGCD(a, b); //Runtime efficiency = O(min(a,b))
        System.out.println(bfgcd);
    }

    private static int getBruteForceGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int gcd = 1;
        if (min == 0) return max;
        for (int i = 0; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int getEuclidsGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (min == 0) return max;
        while (max % min != 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
        return min;
    }
}
