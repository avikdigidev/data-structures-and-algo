package com.codesignal.arcade.intro;

public class ArraysMaxDifference {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 0};
        System.out.println(solution(arr));
    }

    static int solution(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < 0) {
                max = Math.max(max, inputArray[i - 1] - inputArray[i]);
            } else {
                max = Math.max(Math.abs(inputArray[i] - inputArray[i - 1]), max);
            }

        }

        return max;
    }

}
