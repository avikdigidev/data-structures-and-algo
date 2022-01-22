package com.renaissance.maths;

public class GCDOfArray {
    public static void main(String[] args) {
        //int[] arr= {8,4,5,2,11,6,3,9,52};
        int[] arr= {2,4,6};
        int target = 1;
        int targetGCDPossible = getGCD(arr,target);
        if (targetGCDPossible==1){
            System.out.println("possible");
        }else{
            System.out.println("not possible");
        }
    }

    private static int getGCD(int[] arr, int target) {
        int gcd= getEuclidsGCD(arr[0],arr[1]);
        int n = arr.length;
        for (int i = 2; i < n; i++) {
            gcd = getEuclidsGCD(gcd,arr[i]);
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
