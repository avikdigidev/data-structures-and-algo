package com.renaissance.arrays;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-lonely-numbers-in-the-array
public class LonelyNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,5,3};
        System.out.println(findLonely(nums));
    }
    public static List<Integer> findLonely(int[] nums) {

        sortArray(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            boolean flag = true;
            if(i-1 >=0 && nums[i-1] >= nums[i]-1){
                flag = false;
            }
            if(i+1 <nums.length && nums[i+1] <= nums[i]+1){
                flag = false;
            }
            if(flag){
                res.add(nums[i]);
            }
        }
        return res;
    }

    public static void sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
