package com.renaissance.arrays;

/*Find the sum of all sub arrays of an array*/
public class ReverseLookup1D {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3};
        long sum = getSumOfSubArrays(arr);
        System.out.println(sum);
    }

    private static long getSumOfSubArrays(long[] arr) {
        long n = arr.length;
        long result = 0;
        /*
        here for all the elements we are going to count its contribution in all sub arrays
        for example in the array 1,2,3
        1 can be part of [1],[1,2] and [1,2,3] sum will be 1+3+6
        2 will be [2],[2,3] sum will be 2+5
        and finally 3 will be part of [3] sum will be 3
        Consider the below array:
        {a[0].......a[i]......a[n-1]}
        starting points of sub array which will for sure have a[i],
        can be between a[0] and a[i] ==> (i+1) elements
        Similarly, ending point of sub array which will for sure have a[i],
        will be between a[i] and a[n-1] ==> (n-1) elements
        so we can easily see that
        a[i] element will come in subarray (i+1)*(n-i) times
        and its contribution will be a[i]*(i+1)*(n-i)

        we are required to answer the result in 10^9+7 modulo.
        The reason behind this is, if problem constraints are large integers,
        only efficient algorithms can solve them in allowed limited time.
        */
        long m = 1000000007;
        for (int i = 0; i < n; i++) {
            result += ((arr[i]%m) * ((i + 1)%m) * ((n - i)%m))%m;
        }
        return result%m;
    }
}
