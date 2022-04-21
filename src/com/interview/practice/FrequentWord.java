package com.interview.practice;

import java.util.Collections;
import java.util.HashMap;


public class FrequentWord {
    public static void main(String[] args) {
        String frequentWord = findMostFrequent("to jog is a good way to stay fit");
        System.out.println(frequentWord);
    }

    private static String findMostFrequent(String str) {
        String[] strArray = str.split(" ");
        HashMap<String, Integer> hm = new HashMap<>(strArray.length);
        for (int i = 0; i < strArray.length; i++) {
            if (hm.containsKey(strArray[i])) {
                int count = hm.get(strArray[i]);
                hm.put(strArray[i], ++count);
            } else {
                hm.put(strArray[i], 1);
            }

        }
        return Collections.max(hm.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
    }
}
