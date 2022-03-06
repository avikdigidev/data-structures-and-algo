package com.leetcode.website.easy;
//https://leetcode.com/problems/sqrtx/
public class SquareRoot {
    public static void main(String[] args) {
        int num = 8;
        int root = getSquareRootRepeatedSubtractionMethod(num);
        System.out.println(root);
    }

    private static int getSquareRootRepeatedSubtractionMethod(int num) {
        int num2 = num;
        int result = 0;
        for (int i = 1; i <= num2; i += 2) {
            if (i > num) return result;
            num = num - i;
            result++;
            if (num == 0) {
                return result;
            }
        }
        return result;
    }
}
