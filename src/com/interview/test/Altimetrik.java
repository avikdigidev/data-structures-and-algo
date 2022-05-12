package com.interview.test;

import java.util.List;
import java.util.function.Predicate;

public class Altimetrik {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = findSecondLargestNumber(arr);
        System.out.println(result);
        String s1 = "listen";
        String s2 = "silent";
        boolean isAnagram = checkForAnagram(s1, s2);

        Predicate<Integer> isEven = (a)->a%2==0;
        System.out.println(isAnagram);
        int b = 9;
        isEven.test(b);

    }//config/naming server //how to trace requests

    public void sample(List<Object> ls) {


    }

    private static boolean checkForAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] alphabet = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            alphabet[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            alphabet[s2.charAt(i) - 'a']--;
        }

        for (int alpha : alphabet) {
            if (alpha != 0) return false;
        }
        return true;
    }

    private static int findSecondLargestNumber(int[] arr) {
        int first = 0, second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) { //2
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }


        return second;
    }
}
