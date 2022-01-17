package com.udemy.recursion;

public class GCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int gcd = getGCD(a,b);
        System.out.println(gcd);
    }

    private static int getGCD(int a, int b) {
        if(a<0 || b<0) return -1;
        if(b==0) return a;
        return getGCD(b, a%b);
    }
}
