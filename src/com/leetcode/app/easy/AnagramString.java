package com.leetcode.app.easy;

//https://leetcode.com/problems/valid-anagram/
public class AnagramString {
    public static void main(String[] args) {
        String s1 = "abcdg";
        String s2 = "dcabf";
        boolean isAnagram = checkAnagram(s1, s2);
        System.out.println(isAnagram);
    }

    private static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] alphabets = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            alphabets[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            alphabets[s2.charAt(i) - 'a']--;
        }
        for (int i : alphabets) {
            if (i != 0) return false;
        }
        return true;
    }
}
