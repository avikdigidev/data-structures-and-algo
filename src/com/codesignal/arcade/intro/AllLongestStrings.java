package com.codesignal.arcade.intro;

import java.util.Arrays;
import java.util.stream.Stream;

/*
* Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.*/
public class AllLongestStrings {
    public static void main(String[] args) {
        String[] input= {"awsgf","af","adsya", "asju", "bbd"};
        System.out.println(Arrays.toString(solution(input)));
        System.out.println(Arrays.toString(solution2(input)));
    }
   static String[] solution(String[] inputArray) {
        int max =Integer.MIN_VALUE;
        int count = 0;

       for (String s : inputArray) {
           max = Math.max(s.length(), max);
       }
       for (String s : inputArray) {
           if (s.length() == max) {
               count++;
           }

       }
        String[] result = new String[count];
        int k =0;
       for (String s : inputArray) {
           if (s.length() == max) {
               result[k] = s;
               k++;
           }

       }
        return result;
    }

    static String[] solution2(String[] inputArray) {
        int max =Integer.MIN_VALUE;
        for (String value : inputArray) {
            max = Math.max(value.length(), max);
        }

        int finalMax = max;
        return Stream.of(inputArray)
                .filter(s -> s.length() == finalMax)
                .toArray(String[]::new);

    }

}
