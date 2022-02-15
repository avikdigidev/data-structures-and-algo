package com.leetcode.app.easy;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "able";
        String reverse = getReverse(s1);
        System.out.println(reverse);
    }

    private static String getReverse(String s) {
        if (s == null || s.length() < 2) return s;
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            i++;
            j--;
        }
        return new String(chars);
    }
}
