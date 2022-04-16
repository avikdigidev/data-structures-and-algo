package com.codesignal.arcade.intro;

public class ReverseInParentheses {
    public static void main(String[] args) {
        String s = reverseInsideParanthesis("foo(bar)baz(blim)"); //"foorabblim"

        System.out.println(s);
    }

    private static String reverseInsideParanthesis(String s) {
        int firstInd = s.lastIndexOf('(');
        int lastInd = s.indexOf(')', firstInd);
        while (firstInd != -1) {
            String revStr = new StringBuilder(s.substring(firstInd + 1, lastInd)).reverse().toString();
            String first = s.substring(0, firstInd);
            String last = s.substring(lastInd + 1);
            s = first + revStr + last;
            firstInd = s.lastIndexOf('(');
            lastInd = s.indexOf('(', firstInd);
        }
        return s;
    }
}



