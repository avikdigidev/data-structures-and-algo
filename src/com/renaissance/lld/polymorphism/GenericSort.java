package com.renaissance.lld.polymorphism;

import java.util.Arrays;

//Generic sort method using Polymorphism
public class GenericSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 1, 2, 369, 9, 47, 14, 0, -1};
        SortingUtility.sort(arr, new AscComparator());
        System.out.println(Arrays.toString(arr));
        SortingUtility.sort(arr, new DescComparator());
        System.out.println(Arrays.toString(arr));
        SortingUtility.sort(arr, new AbsComparator());
        System.out.println(Arrays.toString(arr));
    }
}
