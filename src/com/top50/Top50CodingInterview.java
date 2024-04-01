package com.top50;

import java.util.LinkedHashMap;
import java.util.Map;

public class Top50CodingInterview {
    public static void main(String[] args) {
        String tuvtg = firstRepeatingCharacter("vtuvtg");
        System.out.println(tuvtg);
    }

    public static String firstRepeatingCharacter(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 1) + 1);
            if (map.get(chars[i]) ==2){
                return String.valueOf(chars[i]);
            }
        }
        return "-1";

    }
}
