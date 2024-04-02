package com.codesignal.arcade.intro;

import java.util.Arrays;

/*
* Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                     "*abc*",
                     "*ded*",
                     "*****"]
Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.
* */
public class AddBorder {
    public static void main(String[] args) {
        String[] picture = {"abc", "def"};
        System.out.println(Arrays.toString(solution(picture)));
    }

    private static String[] solution(String[] picture) {
        String[] result = new String[picture.length + 2];
        int resultLength = result.length;
        int length = picture[0].length();
        StringBuilder sb = new StringBuilder();
        String star = "*";
        sb.append(star);
        sb.append(star);
        for (int i = 0; i < length; i++) {
            sb.append(star);
        }
        String starRows = sb.toString();
        result[0] = starRows;
        result[resultLength - 1] = starRows;

        for (int i = 1; i < resultLength-1; i++) {
           String s = star + picture[i-1] +star;
            result[i] = s;
        }


        return result;
    }

}
