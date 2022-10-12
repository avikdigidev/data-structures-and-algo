package com.linkedin.java.algorithms.string;



public class NormalizeString {
    public static void main(String[] args) {
        String input = "          Hello there, Prakash       ";
        System.out.println(normalizeString(input));
    }

    private static String normalizeString(String input) {
        return input.toLowerCase().trim().replace(",", "");
    }
}
