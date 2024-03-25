package com.gfg.crash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        MyHash myHash = new MyHash(7);
        myHash.insert(49);
        myHash.insert(56);
        myHash.insert(72);
        System.out.println(myHash.search(56));
        myHash.erase(56);
        System.out.println(myHash.search(56));
        int arr[] = {-1, 4, -3, 5, 1};
        int arr1[] = {5, 6, 0, 8};
        int arr2[] = {5, 6, -16, 8};
        boolean result = naive_subArrayWith0Sum(arr2);
        boolean result1 = prefixSum_subArrayWith0Sum(arr2);
        System.out.println(result1);
        int[] arr3 = {3, 2, 5, 6};
        int sum = 7;
        System.out.println(getSubArrayWithGivenSum(arr3, sum));
        System.out.println(naive_getLongestSubArrayWithGivenSum(arr3, 5));
        System.out.println(prefixSum_getLongestSubArrayWithGivenSum(arr3, 5));

        int[] bitArr = {1, 1, 1, 0, 1, 0};
        System.out.println(naive_longestSubArrayWithZerosAndOnes(bitArr));
        System.out.println(longestSubArrayWithZerosAndOnes(bitArr));

    }

    private static int longestSubArrayWithZerosAndOnes(int[] bitArr) {
        //replace every 0 with -1;
        for (int i = 0; i < bitArr.length; i++) {
            if (bitArr[i] == 0)
                bitArr[i] = -1;
        }
        //now find the longest subArray with 0 sum;
        int result =0, target =0, prefixSum = 0;
        Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < bitArr.length; i++) {
            prefixSum += bitArr[i];
            if (prefixSum==target){
                result= i+1;
            }
            if (!resultMap.containsKey(prefixSum)){
                resultMap.put(prefixSum,i);
            }
            if (resultMap.containsKey(prefixSum-target)){
                result = Math.max(result, i- resultMap.get(prefixSum-target));
            }
        }
        return result;
    }

    private static int naive_longestSubArrayWithZerosAndOnes(int[] bitArr) {
        int sum = 0;
        int n = bitArr.length;
        for (int i = 0; i < n; i++) {
            int c0 = 0, c1 = 0;
            for (int j = i; j < n; j++) {
                if (bitArr[j] == 0) {
                    c0++;
                } else {
                    c1++;
                }
                if (c0 == c1) {
                    sum =  Math.max(sum, c0 + c1);
                }
            }
        }

        return sum;

    }

    private static int prefixSum_getLongestSubArrayWithGivenSum(int[] arr, int target) {
        int result = 0, prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum == target) {
                result = i + 1;
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
            if (map.containsKey(prefixSum - target)) {
                result = Math.max(result, i - map.get(prefixSum - target));
            }
        }
        return result;
    }

    private static int naive_getLongestSubArrayWithGivenSum(int[] arr3, int sum) {
        int result = 0;
        for (int i = 0; i < arr3.length; i++) {
            int cSum = 0;
            for (int j = i; j < arr3.length; j++) {
                cSum += arr3[j];
                if (cSum == sum) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }
        return result;
    }

    private static boolean getSubArrayWithGivenSum(int[] arr3, int sum) {
        Set<Integer> set = new HashSet<>();
        int calculated = 0;
        for (int i = 0; i < arr3.length; i++) {
            calculated += arr3[i];
            if (calculated == sum)
                return true;
            if (set.contains(calculated - sum))
                return true;
            set.add(calculated);
        }
        return false;
    }

    private static boolean prefixSum_subArrayWith0Sum(int[] arr2) {
        Set<Integer> prefixSum = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
            if (prefixSum.contains(sum)) {
                return true;
            }
            if (sum == 0) return true;
            prefixSum.add(sum);
        }


        return false;
    }

    private static boolean naive_subArrayWith0Sum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            sum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (sum == 0) return true;
                sum += arr[j];

            }
        }
        return false;

    }
}
