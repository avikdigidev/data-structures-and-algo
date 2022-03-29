package com.interview.test.accolite.round2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Accolite {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Prakash");
        hm.put(2, "Pradeep");
        hm.put(3, "Alas");
        hm.put(4, "aPrakash");
        hm.put(5, "Pash");
        int[] arr = {9, 8, 7, 6, 1, 2, 3, 4, 5, 2};

                // TODO sort NlogN

        // TODO without doing any iteration add, delete and min in O(1) maybe by stack
         // sort hm based on values using Stream.
hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e-> System.out.println(e.getValue()));


    }

}
