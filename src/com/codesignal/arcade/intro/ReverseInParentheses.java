package com.codesignal.arcade.intro;

import java.util.Stack;


public class ReverseInParentheses {
    public static void main(String[] args) {
        String s = reverseInsideParenthesis("foo(bar)baz(blim)"); //"foorabblim"

        System.out.println(s);
    }

    static void reverse(char A[], int l, int h) {
        if (l < h) {
            char ch = A[l];
            A[l] = A[h];
            A[h] = ch;
            reverse(A, l + 1, h - 1);
        }
    }

    private static String reverseInsideParenthesis(String s) {

        Stack<Integer> st = new Stack<Integer>();
        int len = s.length();
        for (int i = 0; i < len; i++) {

            // Push the index of the current
            // opening bracket
            if (s.charAt(i) == '(') {
                st.push(i);
            }

            // Reverse the substring starting
            // after the last encountered opening
            // bracket till the current character
            else if (s.charAt(i) == ')') {
                char[] A = s.toCharArray();
                reverse(A, st.peek() + 1, i);
                s = String.copyValueOf(A);
                st.pop();
            }
        }

        // To store the modified string
        String res = "";
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ')' && s.charAt(i) != '(') {
                res += (s.charAt(i));
            }
        }
        return res;
    }
}



