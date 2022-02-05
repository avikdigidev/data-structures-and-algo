package com.renaissance.maths;

import java.util.Arrays;

/*This solution is for cases when we need to find primes between very large numbers
 * like 10^10, here we will have 2 large numbers, L and R and we need to find
 * all the primes between L and R
 * there can be q test cases L1,R1.....Lq,Rq*/
public class SegmentedSieve {
    public static void main(String[] args) {
        long l = (long) Math.pow(10, 10);
        long r = (long) Math.pow(10, 10) + 500;
        //preprocessing
        System.out.println((int) (Math.sqrt(r) + 1));
        long[] primes = getPrimes(l, r);
        int size = (int) ((r - l) + 1);
        boolean[] isPrime = new boolean[size];
        Arrays.fill(isPrime, true);

        for (int i = 2; i < primes.length; i++) {

            long k = (long) ceil(l ,primes[i]);
            for (int j = (int) Math.max(k, 2); primes[i] * j <= r; j++) {
                isPrime[(int) ((primes[i] * j) - l)] = false;

            }
        }
    }

    private static long ceil(long l, long r) {
        //calculate ceil (a/b) then if a is divisible by b, just do a/b, otherwise you need a/b + 1.
        return (l%r==0)?l/r:(l/r)+1;
    }

    private static long[] getPrimes(long l, long r) {
        int size = (int) (Math.sqrt(r) + 1);
        boolean[] isPrime = new boolean[size];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        //getting status of the numbers if they are prime or not
        for (int i = 2; i * i < size; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j < size; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        //getting the list of numbers
        long[] primes = new long[size];
        for (int i = 0; i < (int) (Math.sqrt(r) + 1); i++) {
            if (isPrime[i]) {
                primes[i] = i;
            }

        }
        return primes;
    }
}
