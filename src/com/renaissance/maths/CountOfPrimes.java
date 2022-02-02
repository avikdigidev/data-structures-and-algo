package com.renaissance.maths;

import java.util.Scanner;

public class CountOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = getCountOfPrimes(n);
        System.out.println(res);
    }

    private static int getCountOfPrimes(int n) {
        int count = 0;
        boolean[] primes = new boolean[n + 1];
        //creating boolean array of n+1 size and initialize with all true
        for (int i = 1; i < primes.length; i++) {
            primes[i] = true;
        }
        // 1 is not prime
        primes[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i; i * j <= n; j++) {
                    primes[i * j] = false;
                }
            }
        }
        //getting only prime
        for (int i = 2; i < primes.length; i++) {
            if (i < n && primes[i]) {
                count++;
            }
        }
        //return total count
        return count;
    }
}
