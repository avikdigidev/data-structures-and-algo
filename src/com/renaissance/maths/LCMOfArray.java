package com.renaissance.maths;

public class LCMOfArray {
    public static void main(String[] args) {
        //int[] arr= {8,4,5,2,11,6,3,9,52};
        int[] arr= {2,4,10};
        int lcm = getLCMOfArray(arr);
        System.out.println(lcm);
    }

    private static int getLCMOfArray(int[] arr) {
        int lcm = getLCM(arr[0],arr[1]);
        int n = arr.length;
        for (int i = 2; i < n; i++) {
            lcm = (lcm*arr[i])/getGCD(lcm,arr[i]);
        }
        return lcm;
    }


    private static int getLCM(int a, int b) {
        int lcm = 0;
        int gcd = getGCD(a,b);
        lcm = (a*b)/gcd;
        return lcm;
    }

    private static int getGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (min == 0) return max;
        while(max%min!=0){
            int temp = max;
            max = min;
            min= temp%min;
        }
        return min;
    }
}
