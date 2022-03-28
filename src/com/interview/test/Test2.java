package com.interview.test;

import java.util.Arrays;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 5, 2, 3, 1, 4};
        int[] arr2 = {5, 4, 8, 1, 7, 2};
        //1,2,3,4,5,7,8
        Arrays.sort(arr);
        Arrays.sort(arr2);
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);

        }
        for (Integer i : hs) {
            System.out.print(i+",");
        }
    }
}
