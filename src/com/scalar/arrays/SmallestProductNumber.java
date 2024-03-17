package com.scalar.arrays;

public class SmallestProductNumber {
    public static void main(String[] args) {
        int result = smallestProductNumber(100);
        System.out.println(result);
    }

    private static int smallestProductNumber(int n) {
        String s = "";

        for (int fact = 9; fact >1; fact--) {
            while (n % fact == 0) {
                n = n / fact;
                s = fact + s;
            }
        }
        if (n != 1) return -1;
        return Integer.parseInt(s);
    }
}
