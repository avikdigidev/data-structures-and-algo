package com.renaissance.arrays;

//Minimum no. of swaps required to get a sub array which has all the numbers less than or equal to k
public class MinSwap {
    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 2, 6, 4};
        int k = 4;
        int swap = minSwap(arr, k);
        System.out.println(swap);

    }

    private static int minSwap(int[] arr, int k) {
        int n = arr.length;
        //first find legalElements
        //will give no. of elements in array which are <=k
        //will give the size of sliding window
        int legalElements = 0;
        for (int i : arr) {
            if (i <= k) {
                legalElements++;
            }
        }
        //sliding window technique applied
        //count will be number of elements in FIRST sub array which are <= k
        int count = 0;
        for (int i = 0; i < legalElements; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }
        //maxCount is the largest number of legalElements which are present in the subarray
        //for now lets initialise it with the count we know
        int maxCount = count;
        //starting with that index which has not been considered in the first sub-array till the end of the main array
        for (int i = legalElements; i < n; i++) {
            //if the element is <=k then we can consider that number and increase the count
            if (arr[i] <= k) {
                count++;
            }
            //as we have moved forward by 1 then we also need to decrease the count if the element is <=k
            if (arr[i - legalElements] <= k) {
                count--;
            }
            //by getting the max we will get to know max legalElements which are possible in sub-array
            maxCount = Math.max(maxCount, count);
        }
        //we can get the min swap count as (legalElements - maxCount) will give the min. no. of illegal elements which are there
        //in sub-array which needs to be removed.
        return legalElements - maxCount;
    }


}
