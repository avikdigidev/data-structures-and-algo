package com.codesignal.arcade.intro;

public class AdjacentElementsProduct {
    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(solution(inputArray));
    }
    public static int solution(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<inputArray.length-1;i++){
            max = Math.max(max, inputArray[i] * inputArray[i + 1]);

        }
        return max;
    }
}
