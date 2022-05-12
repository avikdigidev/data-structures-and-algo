package com.interview.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Altimetrik {
    public static void main(String[] args) {
        int[] arr = {2, 9, 10, 6, 3, 7};
        // int result = findSecondLargestNumber(arr);
        // System.out.println(result);
        String s1 = "listen";
        String s2 = "silent";
        boolean isAnagram = checkForAnagram(s1, s2);
        System.out.println(isAnagram);
int a= 9;
     //   Predicate<Integer> isOdd  = (a%2==0)-> true;

    }//config/naming server //how to trace requests
public void sample(List<Object> ls){



}
    private static boolean checkForAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Arrays.sort(s1.toCharArray());
        Arrays.sort(s2.toCharArray());
        if (s1.equals(s2)) {
            return true;
        }
        return false;


    }

    private static int findSecondLargestNumber(int[] arr) {
        int first = 0, second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) { //2
                second = first;
                first = arr[i];


            }
        }


        return second;
    }
}
