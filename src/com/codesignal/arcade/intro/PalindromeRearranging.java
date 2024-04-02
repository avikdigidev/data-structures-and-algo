package com.codesignal.arcade.intro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*ven a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
solution(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.

Input/Output

[execution time limit] 3 seconds (java)

[memory limit] 1 GB

[input] string inputString

A string consisting of lowercase English letters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 50.

[output] boolean

true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
* */
public class PalindromeRearranging {
    public static void main(String[] args) {

        System.out.println(solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"));
    }

    static boolean solution(String inputString) {
        HashSet<Character> hs= new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (hs.contains(inputString.charAt(i))){
                hs.remove(inputString.charAt(i));
            }else {
                hs.add(inputString.charAt(i));
            }
        }

        return (hs.size()<=1)? true: false;
    }
}

