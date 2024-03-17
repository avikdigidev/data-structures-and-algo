package com.scalar;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3,1,1};
        int res = getMajor(arr);
        System.out.println(res);
    }

    private static int getMajor(int[] arr) {
        int count = 1;
        int candidate = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count=1;
            }
        }
        count =0;
        for (int res : arr){
            if (res == candidate){
                count++;
            }
        }
        if (count> arr.length/2)
            return candidate;
        else
            return -1;
    }

}
