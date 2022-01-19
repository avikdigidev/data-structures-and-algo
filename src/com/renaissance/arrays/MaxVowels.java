package com.renaissance.arrays;

public class MaxVowels {
    public static void main(String[] args) {
        String ip = "prakash";

        int k = 3;
        int totalVowels = getMaxVowels(ip, k);
        System.out.println(totalVowels);
    }

    private static int getMaxVowels(String ip, int k) {
        int res = 0;
        int n = ip.length();
        char[] str = ip.toCharArray();
        int start;
    // getting the total numbers of vowels in the string
        for (int i = 0; i < k; i++) {
            if (isVowel(str[i])) res++;
        }

        int maxVowels = res;
        //finding the number of vowels in the given sub string using sliding window
        for (int end = k; end < n; end++) {
            start = end - k;
            if (isVowel(str[end])) res++;
            if (isVowel(str[start])) res--;
            maxVowels = Math.max(maxVowels, res);
        }

        return maxVowels;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
