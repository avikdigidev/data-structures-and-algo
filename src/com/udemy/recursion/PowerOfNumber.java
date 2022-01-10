package com.udemy.recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 3;
        int power = 3;
        int result = getPower(base,power);
        System.out.println(result);
    }

    private static int getPower(int base, int power) {
        if (power ==0){return 1;}
        return base*getPower(base,power-1);
    }
}
