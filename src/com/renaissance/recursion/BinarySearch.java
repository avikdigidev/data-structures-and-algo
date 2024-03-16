package com.renaissance.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 56, 78, 99};
        int start = 0;
        int size = arr.length;
        int target = 99;
        System.out.println(search(arr, start, size, target));

    }

    public static int search(int arr[], int start, int size, int target) {
        if (start <= size) {
            int mid = start + (size - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return search(arr, mid + 1, size, target);
            } else if (arr[mid] > target) {
                return search(arr, start, mid - 1, target);
            }
        }
        return -1;
    }
}
