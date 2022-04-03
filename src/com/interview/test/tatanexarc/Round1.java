package com.interview.test.tatanexarc;

import java.util.Arrays;
import java.util.HashMap;

public class Round1 {
    //TODO implement linkedList
    // get count of primes till 100
    // get vowels from string

    public static void main(String[] args) {
        //2
        System.out.println(getPrimeCount(100));
        //3
        getVowelCount();

    }

    private static int getPrimeCount(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 1; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        for (int i = 2; i < isPrime.length; i++) {
            if (i < n && isPrime[i]) {
                count++;
            }
        }
        return  count;
    }

    private static void getVowelCount() {
        String input = "prakash";
        HashMap<Character, Integer> vowelMap = new HashMap<>();
        vowelMap.put('a', 0);
        vowelMap.put('e', 0);
        vowelMap.put('i', 0);
        vowelMap.put('o', 0);
        vowelMap.put('u', 0);
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'a') {
                int count = vowelMap.get('a');
                vowelMap.put('a', ++count);
            }
            if (input.charAt(i) == 'e') {
                int count = vowelMap.get('a');
                vowelMap.put('e', ++count);
            }
            if (input.charAt(i) == 'i') {
                int count = vowelMap.get('a');
                vowelMap.put('i', ++count);
            }
            if (input.charAt(i) == 'o') {
                int count = vowelMap.get('a');
                vowelMap.put('o', ++count);
            }
            if (input.charAt(i) == 'u') {
                int count = vowelMap.get('a');
                vowelMap.put('u', ++count);
            }
        }


        vowelMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}
