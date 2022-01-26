package com.renaissance.maths;

public class ListOfPrimes {
    public static void main(String[] args) {
        int n = 100;
        getBruteForcePrimes(n);
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
