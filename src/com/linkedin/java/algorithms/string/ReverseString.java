package com.linkedin.java.algorithms.string;

public class ReverseString {

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));
        System.out.println(reverse2(s));
    }

    private static String reverse2(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
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
