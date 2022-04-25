package com.leetcode;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3};
        int res = getMajor(arr);
    }

    private static int getMajor(int[] arr) {
        int index = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arr[index]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                index = i;
                count++;
            }
        }
        return arr[index];
    }

}
