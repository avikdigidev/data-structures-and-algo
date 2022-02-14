package com.leetcodeapp.easy;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/contains-duplicate/
public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1,5,22,3,1,2,31,65,9};
        boolean containsDuplicate = findDuplicate(arr);
        System.out.println(containsDuplicate);
    }


    private static boolean findDuplicate(int[] arr) {
        Set<Integer> intSet = new HashSet<>(arr.length);
        for(int x : arr){
            if (intSet.contains(x)) return true;
            intSet.add(x);
        }
        return false;
    }
}
