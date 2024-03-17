package com.scalar;

import java.util.HashMap;

public class SmallestProductNumber {
    public static void main(String[] args) {
        int result = smallestProductNumber(1000);
        System.out.println(result);
    }

    private static int smallestProductNumber(int n) {
        HashMap<Integer, Integer> factorCount = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            factorCount.put(i, 0);
        }
        int fact = 9;
        while (n > 1) {
            if (n % fact == 0) {
                n = n / fact;
                factorCount.put(fact, factorCount.get(fact) + 1);
            }
            if (n % fact != 0) {
                fact--;
            }
        }

        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < factorCount.size(); i++) {
            if (factorCount.get(i) != 0) {
                Integer times = factorCount.get(i);
                for (int j = 0; j < times; j++) {
                    s.append(i);
                }
            }

        }
        return Integer.parseInt(s.toString());
    }
}
