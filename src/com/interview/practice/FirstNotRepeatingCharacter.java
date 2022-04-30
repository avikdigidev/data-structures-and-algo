package com.interview.practice;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abacabad";
        char result = getFirstNotRepeatingCharacterUsingStringInBuilt(s);
        char result2 = getFirstNotRepeatingCharacter(s);
        System.out.println(result);
        System.out.println(result2);
    }

    private static char getFirstNotRepeatingCharacter(String s) {
        int[] chars = new int[256];
        for (char c : s.toCharArray()) {
            chars[c]++;

        }
        for (char c : s.toCharArray()) {
            if (chars[c] ==1) return c;

        }
        return '_';
    }

    private static char getFirstNotRepeatingCharacterUsingStringInBuilt(String s) {

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i)))
                return s.charAt(i);
        }
        return '_';

    }
}
