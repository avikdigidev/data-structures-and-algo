package com.leetcode.app.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int a = 121;
        boolean palindromeNumber = isPalindromeNumber(a);
    }

    private static boolean isPalindromeNumber(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
