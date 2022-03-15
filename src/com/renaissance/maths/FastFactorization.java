package com.renaissance.maths;

public class FastFactorization {
    /*This needs to be done when there are multiple queries
     * because the pre processing time for this approach alone would be O(Nlog(logN))
     * which is much higher than O(Math.sqrt(N))
     *
     * Problem: we have q queries n1,n2,n3.... such that every n < num.
     * List prime factors of every n1,n2....
     * */
    public static void main(String[] args) {
        int num = 6560;
        //First we need to find the Smallest Prime Factor
        int[] primes = new int[num + 1];
        int[] spf = new int[num + 1];
        getFastFactorization(primes, spf, num); // O(Nlog(logN))
        int n1 = 5460;

        getPrimeFactors(spf, n1); //For every query O(log2N)
    }

    private static void getPrimeFactors(int[] spf, int n1) {
        while (spf[n1] != -1) {
            System.out.println(spf[n1]);
            n1 = n1 / spf[n1];
        }
        if (n1 != 1) {
            System.out.println(n1);
        }
    }


    private static void getFastFactorization(int[] primes, int[] spf, int n) {
        for (int i = 1; i < primes.length; i++) {
            primes[i] = 1;
        }
        primes[1] = 0;
        for (int i = 1; i < spf.length; i++) {
            spf[i] = -1;
        }
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == 1) {
                for (int j = i; i * j <= n; j++) {
                    if (primes[i * j] == 1) {
                        spf[i * j] = i;
                        primes[i * j] = 0;

                    }
                }
            }

        }

    }

}