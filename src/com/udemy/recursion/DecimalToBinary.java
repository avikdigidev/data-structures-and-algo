package com.udemy.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int a = 23;
        int result = decimalToBinary(a);
        System.out.println(result);
    }

    private static int decimalToBinary(int a) {
        if(a==0) return 0;
        return a%2 + 10*decimalToBinary(a/2);
    }
}
