package com.codesignal.arcade.intro;

import java.util.Arrays;
/*
* Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".*/
public class CommonCharacterCount {
    public static void main(String[] args) {
        String s1 = "aadcaa", s2 = "aabc";
        int n1 = s1.length(), n2 = s2.length();
        System.out.println(solution(s1, s2));
    }
    static int solution(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        // To store the frequencies of characters
        // of string s1 and s2
        int []freq1 = new int[26];
        int []freq2 = new int[26];
        Arrays.fill(freq1, 0);
        Arrays.fill(freq2, 0);

        // To store the count of valid pairs
        int i, count = 0;

        // Update the frequencies of
        // the characters of string s1
        for (i = 0; i < n1; i++)
            freq1[s1.charAt(i) - 'a']++;

        // Update the frequencies of
        // the characters of string s2
        for (i = 0; i < n2; i++)
            freq2[s2.charAt(i) - 'a']++;

        // Find the count of valid pairs
        for (i = 0; i < 26; i++)
            count += (Math.min(freq1[i], freq2[i]));

        return count;
    }

}
