package com.leetcode.website.arrays101;

//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
//https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3258/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 4, 4, 5};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        // Check for edge cases.
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Use the two pointer technique to remove the duplicates in-place.
        // The first element shouldn't be touched; it's already in its correct place.
        int k = 0;
        // Go through each element in the Array.
        for (int i = 1; i < nums.length; i++) {
            // If the current element we're reading is *different* to the previous
            // element...
            if (nums[i] != nums[k]) {
                // We need to now increment k, because the next element
                // should be written one space over.
                k++;
                // Copy it into the next position at the front, tracked by k.
                nums[k] = nums[i];
            }
        }
        // This turns out to be the correct length value.
        return k + 1;
    }
}
