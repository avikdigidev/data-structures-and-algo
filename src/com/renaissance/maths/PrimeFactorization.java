package com.renaissance.maths;

public class PrimeFactorization {
    public static void main(String[] args) {
        int num = 404;
        getPrimeFactors(num); // Runtime complexity: O(Math.sqrt(N)
        getBruteForcePrimeFactors(num);
    }

    private static void getBruteForcePrimeFactors(int num) {
        for (int i = 2; i <=num ; i++) {
            while(num%i==0){
                System.out.println(i);
                num = num/i;
            }
        }
    }

    private static void getPrimeFactors(int num) {
        for (int i = 2; i*i <=num ; i++) {
            while(num%i==0){
                System.out.println(i);
                num = num/i;
            }
        }
        if (num != 1) System.out.println(num);
    }
}
