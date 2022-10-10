package com.renaissance.recursion;

public class DivideAndConquer {
    public static void main(String[] args) {
        int[] arr = {97,5,2,15,4,8,6,3,9};
        int start = 0;
        int end = arr.length-1;
        int max = getMax(arr, start, end);
        System.out.println(max);
    }

    private static int getMax(int[] arr, int start, int end) {
        if (end ==start){
            return arr[end];
        }
        int middle = (start + end)/2;

        return Math.max(getMax(arr,start, middle), getMax(arr,middle+1, end));
    }
}
