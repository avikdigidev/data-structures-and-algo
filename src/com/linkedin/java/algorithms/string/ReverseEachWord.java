package com.linkedin.java.algorithms.string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "My name is Prakash";
        System.out.println(reverseAllWords(input));

    }

    private static String reverseAllWords(String input) {
        String[] splits = input.split(" ");
        StringBuilder sb1 = new StringBuilder();
        for (String s : splits) {
            StringBuilder sb = new StringBuilder(s);
            String s1 = sb.reverse().toString();
            sb1.append(s1);
            sb1.append(" ");

        }
        return sb1.toString().trim();
    }
}
