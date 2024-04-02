package com.top50;

import java.util.*;

public class Top50CodingInterview {
    public static void main(String[] args) {
        int arr[] = {34, 3, 20, 34, 1, 0};
        String tuvtg = firstRepeatingCharacter("gvtuvtg");
        System.out.println(tuvtg);
        System.out.println("Duplicate: " + findDuplicate(arr, arr.length));
        System.out.println("Duplicates removed: " + Arrays.toString(removeDuplicates(arr)));
//ReverseLinkedList
        //maxSubarray


        int n = arr.length;
        System.out.println("Index of a peak point is " + findPeak(arr, n));
        findpeak2(arr, n);
        System.out.println("Index of a peak point is " + findpeak2(arr, n));
    }

    private static boolean findDuplicate(int[] arr, int length) {
        int duplicate = Integer.MIN_VALUE;
        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < length; i++) {
            if (unique.contains(arr[i])) {
                return true;
            }
            unique.add(arr[i]);
        }
        return false;
    }

    private static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new LinkedHashSet<>(); // LinkedHashSet maintains insertion order
        for (int num : arr) {
            uniqueElements.add(num);
        }
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            result[index++] = num;
        }
        return result;
    }

    private static int findpeak2(int[] arr, int n) {
        return findPeakUtil2(arr, 0, n - 1, n);
    }

    private static int findPeakUtil2(int[] arr, int start, int end, int n) {
        int mid = start + (end - start) / 2;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        } else if ((mid > 0) && arr[mid - 1] >= arr[mid]) {
            return findPeakUtil2(arr, start, mid - 1, n);
        } else {
            return findPeakUtil2(arr, mid + 1, end, n);
        }
    }


    public static String firstRepeatingCharacter(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 1) + 1);
            if (map.get(chars[i]) == 2) {
                return String.valueOf(chars[i]);
            }
        }
        return "-1";

    }

    static int findPeakUtil(
            int arr[], int low, int high, int n) {
        // Find index of middle element
        // low + (high - low) / 2
        int mid = low + (high - low) / 2;

        // Compare middle element with its
        // neighbours (if neighbours exist)
        if ((mid == 0 || arr[mid - 1] <= arr[mid])
                && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;

            // If middle element is not peak
            // and its left neighbor is
            // greater than it, then left half
            // must have a peak element
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, low, (mid - 1), n);

            // If middle element is not peak
            // and its right neighbor
            // is greater than it, then right
            // half must have a peak
            // element
        else
            return findPeakUtil(
                    arr, (mid + 1), high, n);
    }

    // A wrapper over recursive function
    // findPeakUtil()
    static int findPeak(int arr[], int n) {
        return findPeakUtil(arr, 0, n - 1, n);
    }
}
