package com.interview.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindErrorNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        int[] result = findErrorNumbers(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findErrorNumbers(int[] arr) {
        int n = arr.length;
        int[] result = new int[2];
        int duplicate = 0;
        int missingNumber = 0;
        Set set = new HashSet(arr.length);

        for (int x : arr) {
            if (set.contains(x)) {
                duplicate=x;
            }
            set.add(x);
        }

        int expectedSum = (n*(n+1))/2;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
missingNumber = (expectedSum-sum)+duplicate;
        result[0]=duplicate;
        result[1]=missingNumber;

        return result;
    }
}
