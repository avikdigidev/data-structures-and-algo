package com.leetcode.app.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9};
        int[] result = twoSum(arr, 10);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution possible");
    }
}
