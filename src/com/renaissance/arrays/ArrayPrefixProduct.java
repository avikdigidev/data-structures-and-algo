package com.renaissance.arrays;

public class ArrayPrefixProduct {
    public static void main(String[] args) {
        int[] arr = {1,12,3,45,6,78,9};
        int[] result = getPrefixProduct(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    private static int[] getPrefixProduct(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i]* arr[i-1];
        }
        return arr;
    }
}
