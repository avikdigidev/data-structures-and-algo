package com.leetcode.website.arrays101;
//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231
public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6};
        int max = getAtLeastThirdMax(arr);
        System.out.println(max);
    }

    private static int getAtLeastThirdMax(int[] nums) {
        int largest = 0, secondLargest = -1, thirdLargest = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[largest]) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            } else if (nums[i] != nums[largest]) {
                if (secondLargest == -1 || nums[i] > nums[secondLargest]) {
                    thirdLargest = secondLargest;
                    secondLargest = i;
                } else if (nums[i] != nums[secondLargest]) {
                    if (thirdLargest == -1 || nums[i] > nums[thirdLargest])
                        thirdLargest = i;
                }
            }
        }
        return thirdLargest == -1 ? nums[largest] : nums[thirdLargest];
    }


}
