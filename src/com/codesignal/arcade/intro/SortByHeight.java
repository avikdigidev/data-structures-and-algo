package com.codesignal.arcade.intro;

import java.util.Arrays;

public class SortByHeight {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(a)));

    }

    static int[] solution(int[] a) {
        if (a == null || a.length < 2) return a;
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            if (a[l] == -1) {
                l++;
            } else if (a[r] == -1) {
                r--;
            } else {
                insertionSort(a, l, r);
                l++;
            }
        }

        return a;
    }

    private static void insertionSort(int[] a, int l, int r) {
        for (int i = r; i >= l; i--) {
            if (a[i] != -1 && a[i] < a[l])
                swap(a, i, l);
        }
    }

    private static void swap(int[] a, int p1, int p2) {
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }


}
