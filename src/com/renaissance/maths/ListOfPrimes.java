package com.renaissance.maths;

public class ListOfPrimes {
    public static void main(String[] args) {
        int n = 100;
        getBruteForcePrimes(n); //O(N*Math.sqrt(N))
        System.out.println();
        getPrimeEfficient(n); //O(N)

    }

    private static void getPrimeEfficient(int n) {
        System.out.print(2+","+3+",");
        for (int i = 1; (6*i + 1) <=n ; i++) {

            System.out.print((6*i - 1) +","+(6*i + 1)+",");

        }
    }

    private static void getBruteForcePrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)){
                System.out.print(i + ", ");
            }
        }
    }
    private static boolean checkPrime(int number) {
        for (int i = 2; i <= (int)Math.sqrt(number); i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

}
