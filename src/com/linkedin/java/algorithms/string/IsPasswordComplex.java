package com.linkedin.java.algorithms.string;

public class IsPasswordComplex {
    public static void main(String[] args) {
        String input = "A1w34cv";
        System.out.println(isPasswordComplex(input));
    }

    private static boolean isPasswordComplex(String input) {
        return input.chars().anyMatch(c->Character.isUpperCase(c)) &&
                input.chars().anyMatch(c->Character.isLowerCase(c)) &&
        input.chars().anyMatch(c->Character.isDigit(c));
    }
}
