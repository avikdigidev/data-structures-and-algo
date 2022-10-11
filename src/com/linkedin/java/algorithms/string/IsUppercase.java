package com.linkedin.java.algorithms.string;

public class IsUppercase {
    public static void main(String[] args) {
        String input = "PRAKASH";
        boolean result = isUppercase(input);
        System.out.println(result);
    }

    private static boolean isUppercase(String input) {
        return input.chars().allMatch(c->(Character.isUpperCase(c)));
    }
}
