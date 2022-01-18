package com.renaissance.arrays;

import java.util.Arrays;
//https://www.geeksforgeeks.org/rearrange-array-arrj-becomes-arri-j/#
public class RearrangeArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,2,0}; //{4,0,3,1,2}
        int[] res = rearrangeBetter(arr);
        int[] swappedArr = rearrangeBruteForce(arr);



    }

    private static int[] rearrangeBetter(int[] arr) {
        int n = arr.length;
        /*we know that
        * Dividend = Divisor*Quotient + remainder
        * so if we consider Divisor as n
        * So, old value = Dividend %n
        * and new value = Dividend/n
        * and we know that any element of array is between 1 to n
        * */
        for (int i = 0; i < n; i++) {
            int old= arr[i]%n; //getting the old value
            arr[old] = n*i + arr[old]; // storing the new value as Dividend
        }
        //now that we have the array of dividend we just need array of new values which
        //can be obtained simply by dividing by n
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]/n;
        }
        return arr;
    }

    private static int[] rearrangeBruteForce(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            res[val] = i;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
