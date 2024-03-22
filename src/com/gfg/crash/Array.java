package com.gfg.crash;

import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {10, 2, 5, 8,5};
        //    System.out.println(delete(arr, arr.length, n));
/*
        List<Integer> list = new ArrayList<>(5);
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list);
        int x = 3;
        int cap = 10;
        int position = 2;
        int res = insert(list, n, x, cap, position);
        System.out.println(list);
        int res1 = getLargest(arr);
        System.out.println(res1);
        System.out.println(isSorted(arr));
        System.out.println(getSecondLargest(arr, arr.length));*/
        //reverse(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
        //System.out.println(removeDuplicatesFromSorted(arr, arr.length));
     //   leftRotateArrayByOne(arr,arr.length);
        System.out.println("Rotated: " + Arrays.toString(arr));
        int times =2;
      //  naiveRotateArrayByKTimes(arr,arr.length,times);
        System.out.println("Rotated "+times+":"+Arrays.toString(arr));
        leftRotateArrayByKTimesReversalAlgorithm(arr,arr.length,times);
        System.out.println("Rotated "+times+":"+Arrays.toString(arr));
        int arr2[]= {8,0,18,5,1,0,0};
       int[] temp= moveZerosToEnd(arr2,arr2.length);
        System.out.println("Moved 0 to end "+Arrays.toString(temp));
        int[] arr3 = {10, 2, 5, 8,5};
        System.out.println(immediateSmaller(arr3,arr3.length,11));
        int[] arr4 = {10, 2, 5, 8,5};
        System.out.println(isSorted(arr4,arr4.length));
    }
    public static int isSorted(int arr[], int n) {
        int inc = 0; // Counter for increasing sequences
        int dec = 0; // Counter for decreasing sequences

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Check if the current element is less than the next element
            if (arr[i] < arr[i + 1])
                inc++; // Increment the increasing counter
                // Check if the current element is greater than the next element
            else if (arr[i] > arr[i + 1])
                dec++; // Increment the decreasing counter
        }

        // If either inc or dec is zero, the array is sorted
        if (inc == 0 || dec == 0)
            return 1; // Return 1 indicating sorted
        else
            return 0; // Return 0 indicating not sorted
    }
    //Function to find median of the array elements.
    public int median(int A[],int N)
    {

        Arrays.sort(A);
        if(N%2==0){
            return Integer.valueOf((int) Math.floor((A[(N/2)-1]+A[N/2])/2));
        }else{
            return A[N/2];
        }
        //Your code here
        //If median is fraction then conver it to integer and return
    }
    public static int immediateSmaller(int arr[], int n, int x)
    {
        int closest = -1;
        for(int i =0;i<n;i++){

            if(closest<arr[i] && arr[i]<x){
                closest = arr[i];
            }
        }
        return closest;
    }
    private static int[] moveZerosToEnd(int[] arr, int length) {
        int res = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i]!=0){
               int temp =arr[i];
                arr[i]= arr[res];
                arr[res]= temp;
                res++;
            }
        }
        return arr;
    }

    private static void leftRotateArrayByKTimesReversalAlgorithm(int[] arr, int length, int times) {
        reverse(arr,0,times-1);
        reverse(arr,times,length-1);
        reverse(arr,0,length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    private static void naiveRotateArrayByKTimes(int[] arr, int length, int times) {
        for (int i = 0; i < times; i++) {
            leftRotateArrayByOne(arr,length);
        }
    }

    private static void leftRotateArrayByOne(int[] arr, int length) {
        int temp = arr[0];
        for (int i = 0; i < length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[length-1] = temp;
    }

    private static int removeDuplicatesFromSorted(int[] arr, int n) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }


    private static void reverse(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static int getSecondLargest(int[] arr, int n) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        if (n < 2) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            return -1;
        else
            return second;

    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    private static int getLargest(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;

    }


    static int insert(List<Integer> list, int size, int newElement, int capacity, int position) {
        if (size == capacity) return size;
        int idx = position - 1;
        for (int i = size - 1; i > idx; i--) {
            int temp = list.get(i);
            list.add(i + 1, temp);
        }
        list.add(idx, newElement);
        return size + 1;
    }

    public static int delete(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n) return n;
        for (int j = i; j < n - 1; j++) {
            arr[i] = arr[i + 1];

        }
        return n - 1;
    }
}
