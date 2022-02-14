package com.leetcodeapp.arrays101;
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
public class NumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int digitCount = 1;
            while (nums[i] > 9) {
                digitCount++;
                nums[i] = nums[i] / 10;
            }
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
