package com.leetcode.website.medium;

//https://leetcode.com/problems/sort-an-array/
public class MergeSort {
    public static void main(String args[]) {
        int[] array = {12, 1, 10, 50, 5, 15, 45};
        mergeSort(array, array.length);
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array, int length) {
        if (length < 2) return;
        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        int k = 0;
        for (int i = 0; i < length; i++) {
            if (i < mid) {
                leftArray[i] = array[i];
            } else {
                rightArray[k] = array[i];
                k++;
            }
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, length - mid);

        merge(leftArray, rightArray, array, mid, length - mid);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array, int leftSize, int rightSize) {
        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i++] = leftArray[l++];
            } else {
                array[i++] = rightArray[r++];
            }

        }
        while (l < leftSize) {
            array[i++] = leftArray[l++];
        }
        while (r < rightSize) {
            array[i++] = rightArray[r++];
        }
    }
}
