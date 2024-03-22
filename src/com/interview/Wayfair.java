package com.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Wayfair {
    public static void main(String[] args) {
        int[] arr = {44, 42, 15, 16};
        int target = 32;
        boolean res = targetWeight(arr, target);
        System.out.println(res);
    }

    private static boolean targetWeight(int[] nums, int target) {

        Map<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)){
                return  true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
