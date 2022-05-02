package com.interview.practice;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abacabad";
        char result = getFirstNotRepeatingCharacterUsingStringInBuilt(s);
        char result2 = getFirstNotRepeatingCharacter(s);
        char result3 = getFirstNotRepeatingCharacterMostEfficient(s);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static char getFirstNotRepeatingCharacterMostEfficient(String s) {
        int noOfChars = 256;
        HashMap<Character, CountIndex> hm = new HashMap<>(noOfChars);
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.get(s.charAt(i)).incCount();
            } else {
                hm.put(s.charAt(i), new CountIndex(i));
            }
        }

        int result = Integer.MAX_VALUE, i;
        for (Map.Entry<Character, CountIndex> entry : hm.entrySet()) {
            int c = entry.getValue().count;
            int ind = entry.getValue().index;
            if (c == 1 && ind < result) {
                result = ind;
            }
        }
        return s.charAt(result);
    }

    private static char getFirstNotRepeatingCharacter(String s) {
        int[] chars = new int[256];
        for (char c : s.toCharArray()) {
            chars[c]++;

        }
        for (char c : s.toCharArray()) {
            if (chars[c] == 1) return c;

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

class CountIndex {
    int count, index;

    public CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }

    public void incCount() {
        this.count++;
    }
}
