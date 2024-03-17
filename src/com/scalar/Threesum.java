package com.scalar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, 4};
        System.out.println(threeSum(a,2));
    }

    public static List<List<Integer>> threeSum(int[] nums, int goal) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int left = i + 1, right = n - 1, target = goal - nums[i];
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++; // skip duplicates
                        while (left < right && nums[right] == nums[right - 1]) right--; // skip duplicates
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}