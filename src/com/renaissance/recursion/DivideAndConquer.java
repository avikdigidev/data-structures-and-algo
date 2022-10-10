package com.renaissance.recursion;

public class DivideAndConquer {
    public static void main(String[] args) {
        int[] arr = {97,5,2,15,4,8,6,3,9};
        int start = 0;
        int end = arr.length-1;
        int max = getMax(arr, start, end);
        //T.C > N + N/2 + N/4 + N/8 ....1
        /*
        = N(1+1/2+1/4+1/8+.....1)
        = N(a/1-r)          // where a = 1 and r= 1/2
        As we know that a/1-r ~ 2
        then T.C. will be less than 2N
      */

        // S.C> log2 (N)
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
