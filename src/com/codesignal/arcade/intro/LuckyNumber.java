package com.codesignal.arcade.intro;
/*
* Ticket numbers usually consist of an even number of digits.
* A ticket number is considered lucky if the sum of the first half of the digits is equal to
*  the sum of the second half.

Given a ticket number n,
* determine if it's lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.*/
public class LuckyNumber {

    public static void main(String[] args) {
        int n = 5665;
        boolean result = isLucky(n);
        System.out.println(result);
    }

    private static boolean isLucky(int n) {
        String s = Integer.toString(n);
        int left = 0, right = 0;
        if (s.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < s.length() / 2; i++) {
                left += Character.getNumericValue(s.charAt(i));
            }
            for (int i = s.length() / 2; i < s.length(); i++) {
                right += Character.getNumericValue(s.charAt(i));
            }
            if (left == right) {
                return true;
            } else {
                return false;
            }
        }
    }
}
