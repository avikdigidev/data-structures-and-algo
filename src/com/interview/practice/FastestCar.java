package com.interview.practice;

public class FastestCar {
    public static void main(String[] args) {
        int t=25,c1=125,c2=225,c3=625;
        int res = getfastestCar(t,c1,c2,c3);
    }

    private static int getfastestCar(int t, int c1, int c2, int c3) {
        int max = Integer.MIN_VALUE;
        int[] arr = {c1,c2,c3};
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]/t);
        }
        return max;
    }
}
