package com.codesignal.arcade.intro;

import java.util.Arrays;
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
    }
   static String[] solution(String[] inputArray) {
        int max =Integer.MIN_VALUE;
        int count = 0;

        for(int i =0;i<inputArray.length;i++){
            max = Math.max(inputArray[i].length(), max);
        }
        for(int i =0;i<inputArray.length;i++){
            if(inputArray[i].length()==max){
                count++;
            }

        }
        String[] result = new String[count];
        int k =0;
        for(int i =0;i<inputArray.length;i++){
            if(inputArray[i].length()==max){
                result[k]=inputArray[i];
                k++;
            }

        }

        return result;
    }

}
