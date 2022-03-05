package com.leetcode.website.arrays101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
public class DisappearedElementsInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missingElements = findMissing(arr);
        System.out.println(missingElements);
    }

    private static List<Integer> findMissing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
