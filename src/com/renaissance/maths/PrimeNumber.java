package com.renaissance.maths;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 5;
        boolean res = checkPrime(number);
        System.out.println(number +" is prime is "+res);
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
