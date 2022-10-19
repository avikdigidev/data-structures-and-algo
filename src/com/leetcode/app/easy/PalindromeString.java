package com.leetcode.app.easy;

// https://leetcode.com/problems/valid-palindrome/
public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));

    }

    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        return checkPalindrome(s, start, end);
    }

    private static boolean checkPalindrome(String s, int start, int end) {
        if (end < start) {
            return true;
        }
        if (s.charAt(start) == s.charAt(end)) {
            return checkPalindrome(s, ++start, --end);
        } else {
            return false;
        }
    }
}