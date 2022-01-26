package com.renaissance.maths;

public class ListOfPrimes {
    public static void main(String[] args) {
        int n = 100;
        getBruteForcePrimes(n); //O(N*Math.sqrt(N))
        System.out.println();
        getPrimeEfficient(n); //O(N)
        getPrimeMostEfficientSieveOfEratosthenes(n); //Runtime efficiency : O(N*log(log(N))) //space: O(N)
    }

    private static void getPrimeMostEfficientSieveOfEratosthenes(int n) {
        int[] primes = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            primes[i] = 1;
        }
        //if 1 then its prime
        //if 0 then its no n prime
        primes[1] = 0;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (primes[i] == 1) {
                for (int j = i; i*j <=n ; j++) {
                    primes[i*j] = 0;
                }
            }
        }
    }

    private static void getPrimeEfficient(int n) {
        System.out.print(2 + "," + 3 + ",");
        for (int i = 1; (6 * i + 1) <= n; i++) {

            System.out.print((6 * i - 1) + "," + (6 * i + 1) + ",");

        }
    }

    private static void getBruteForcePrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean checkPrime(int number) {
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
