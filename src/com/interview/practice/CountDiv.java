package com.interview.practice;

public class CountDiv {
    public static void main(String[] args) {
        int a =15,b=50,div=5;
        getCountOfDivs(a, b, div);
    }

    private static void getCountOfDivs(int a, int b, int div) {
        System.out.println(b / div - a / div + 1);
    }
}
