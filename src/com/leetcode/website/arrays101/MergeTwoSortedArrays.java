package com.leetcode.website.arrays101;

/*https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
https://www.youtube.com/watch?v=0PHGaGma6j8
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function,
but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n,
where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored.
nums2 has a length of n.
*/

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {4, 5, 51};
        int m = 3;
        int n = 3;
        merge(a, m, b, n);
        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j=n-1;
        int idx = m+n-1;
        while(j>=0) {
            if(i>=0 && nums1[i] > nums2[j]) {
                nums1[idx] = nums1[i--];
            } else {
                nums1[idx] = nums2[j--];
            }
            idx--;
        }
    }
}
