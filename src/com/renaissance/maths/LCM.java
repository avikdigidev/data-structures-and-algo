package com.renaissance.maths;

public class LCM {
    public static void main(String[] args) {
        int a = 4, b = 6;
        int lcm = getBruteForceLCM(a, b);
        System.out.println(lcm);
        int lcm2 = getEfficientlyLCM(a,b);
        System.out.println(lcm2);
    }

    private static int getEfficientlyLCM(int a, int b) {
        int lcm =0;
        int gcd = getGCD(a,b);
        lcm = (a*b)/gcd;
        return lcm;
    }

    private static int getGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (min == 0) return max;
        while(max%min !=0){
            int temp= max;
            max=min;
            min=temp%min;
        }
        return min;
    }

    private static int getBruteForceLCM(int a, int b) {
        int lcm = 0;
        int max = Math.max(a, b);
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
        return lcm;
    }
}
