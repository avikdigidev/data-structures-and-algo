package com.linkedin.java.algorithms.string;

public class ReverseString {

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));

    }

    private static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}
