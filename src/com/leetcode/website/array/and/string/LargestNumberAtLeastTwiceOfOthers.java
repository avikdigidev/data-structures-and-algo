package com.leetcode.website.array.and.string;

/*You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is,
at least twice as much as every other number in the array.
If it is, return the index of the largest element, or return -1 otherwise.



Example 1:

Input: nums = [3,6,1,0]
Output: 1
Explanation: 6 is the largest integer.
For every other number in the array x, 6 is at least twice as big as x.
The index of value 6 is 1, so we return 1.
Example 2:

Input: nums = [1,2,3,4]
Output: -1
Explanation: 4 is less than twice the value of 3, so we return -1.
Example 3:

Input: nums = [1]
Output: 0
Explanation: 1 is trivially at least twice the value as any other number
because there are no other numbers.


Constraints:
1 <= nums.length <= 50
0 <= nums[i] <= 100
The largest element in nums is unique.*/
public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] arr= {3,6,1,0};
        int res = getIndexOfLargest(arr);
        System.out.println(res);
    }

    private static int getIndexOfLargest(int[] arr) {
        if (arr.length==1) return arr[0];
        if (arr ==null ||arr.length==0) return -1;
        int max = Integer.MIN_VALUE;
        int maxIndex= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }

        }
        System.out.println("largest element is: "+max+ " located at: "+ maxIndex);
        for (int i = 0; i < arr.length; i++) {
            if (i==maxIndex) continue;
            if (arr[i]*2>max) return -1;
        }
        return maxIndex;

    }
}
