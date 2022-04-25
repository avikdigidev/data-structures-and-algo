package com.renaissance.recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetsOfSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> a = subsets(arr);
        System.out.println(a);

    }

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> arr = new ArrayList<>();
        pass(arr, new ArrayList<>(), nums, n, 0);
        return arr;
    }

    public static void pass(List<List<Integer>> arr, List<Integer> temp, int[] nums, int n, int i) {
        if (i == n) {
            arr.add(new ArrayList<Integer>(temp));
            return;
        }
        //for not selecting the element
        pass(arr, temp, nums, n, i + 1);
        //for selecting the element
        temp.add(nums[i]);
        pass(arr, temp, nums, n, i + 1);
        temp.remove(new Integer(nums[i]));

    }

}

