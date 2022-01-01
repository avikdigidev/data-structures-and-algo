package com.udemy;

public class SumOfDigits {
    public static void main(String[] args) {
        int input = 12;
        int result = getSum(input);
        System.out.println(result);
    }

    private static int getSum(int input) {
        if (input<=0){return 0;}
        return input%10 + getSum(input/10);
    }
}
