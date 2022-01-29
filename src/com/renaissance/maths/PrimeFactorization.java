package com.renaissance.maths;

public class PrimeFactorization {
    public static void main(String[] args) {
        int num = 20;
        getPrimeFactors(num);
    }

    private static void getPrimeFactors(int num) {
        for (int i = 2; i <=num ; i++) {
            while(num%i==0){
                System.out.println(i);
                num = num/i;
            }
        }
    }
}
