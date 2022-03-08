package com.kk.maths;

import java.util.ArrayList;
//https://www.geeksforgeeks.org/find-divisors-natural-number-set-1/
public class Factors {
    public static void main(String[] args) {
        int n = 125;
        // printAllFactorsOfNBruteForce(n); //O(n)
        // printAllFactorsEfficiently(n); //O(sqrt(n))
        printAllFactorsMostEfficientSorted(n); // T.C and S.c = O(sqrt(n))
    }

    private static void printAllFactorsMostEfficientSorted(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i);
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    private static void printAllFactorsEfficiently(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.println(i);
                    System.out.println(n / i);
                }
            }
        }
    }

    private static void printAllFactorsOfNBruteForce(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
