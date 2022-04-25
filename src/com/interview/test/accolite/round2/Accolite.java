package com.interview.test.accolite.round2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Accolite {
    public static void main(String[] args) {
        //  1st sort array with O(NlogN) efficiency
        int[] array = {9, 8, 7, 6, 1, 2, 3, 4, 5, 2};
        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
        // 2nd sort hashMap based on values using Stream.
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Prakash");
        hm.put(2, "Pradeep");
        hm.put(3, "Alas");
        hm.put(4, "aPrakash");
        hm.put(5, "Pash");
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e -> System.out.println(e.getValue()));

        // 3rd without doing any iteration add, delete and min in O(1) maybe by stack

    }

    private static void mergeSort(int[] array, int length) {
        if (length < 2) return;
        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];
        int rightArrayIndex = 0;
        for (int leftArrayIndex = 0; leftArrayIndex < length; leftArrayIndex++) {
            if (leftArrayIndex < mid) {
                leftArray[leftArrayIndex] = array[leftArrayIndex];
            } else {
                rightArray[rightArrayIndex] = array[leftArrayIndex];
                rightArrayIndex++;
            }
        }
        mergeSort(leftArray, mid);
        mergeSort(rightArray, length - mid);

        merge(leftArray, rightArray, array, mid, length - mid);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array, int leftSize, int rightSize) {
        int i = 0, leftIndex = 0, rightIndex = 0;
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[i++] = leftArray[leftIndex++];
            }else{
                array[i++]= rightArray[rightIndex++];
            }
        }
        while (leftIndex < leftSize){
            array[i++] = leftArray[leftIndex++];
        }
        while (rightIndex < rightSize){
            array[i++]= rightArray[rightIndex++];
        }

    }

}
