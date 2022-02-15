package com.leetcode.app.easy;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        char[] charList = s.toCharArray();
        int start = 0;
        int end = charList.length - 1;
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