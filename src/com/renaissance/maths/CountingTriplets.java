package com.renaissance.maths;

public class CountingTriplets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 16, 24};
        int m = 8;
        int count = getCountOfTripletsBruteForce(arr, m); //O(N^3)
        int count2 = getCountOfTripletsEfficiently(arr, m); //T.C= O(m^2) S.C= O(m)

        System.out.println(count);
        System.out.println(count2);
    }

    private static int getCountOfTripletsEfficiently(int[] arr, int m) {
        int n = arr.length;
        //Law of modularity states that: (a+b)%m = ((a%m)+ (b%m))%m
        //in other words remainders of sum = sum of remainders%m
        //and also the value of (any number %m) will lie between [0...m-1] periodically
        int ans = 0;
        //creating count array
        int[] countArray = new int[m];
        for (int i = 0; i < m; i++) {
            countArray[i] = 0; //initializing the count to 0
        }
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            countArray[arr[i] % m]++; //increasing the count value at the index whenever we get the corresponding value
        }

        /*consider all the cases possible
            1. all elements belong to same bucket
            2. any 2 elements belong to same bucket
            3. all elements belong to different bucket
         */

        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) { //j=i and not j=0 : to handle the case where no other permutation of j and i is considered again
                int k;
                if ((i + j) % m == 0) {
                    k = 0; // by default if 2 elements are from 0 bucket 3rd will also be from 0
                } else {
                    k = m - ((i + j) % m);
                }
                if (k < j) { // to handle the case where no other permutation of j and k is considered again
                    continue;
                }
//when all 3 are equal remainders
                if (i == j && j == k) { //ncr = n!/r!(n-r)! => for triplets n*(n-1)(n-2)/6
                    ans += (countArray[i] * (countArray[i] - 1) * (countArray[i] - 2)) / 6;
                }
//fixing any 2 remainders
                else if (i == j) {
                    ans += (countArray[i] * (countArray[i] - 1) * countArray[k]) / 2;
                } else if (i == k) {
                    ans += (countArray[i] * (countArray[i] - 1) * countArray[j]) / 2;
                } else if (k == j) {
                    ans += (countArray[j] * (countArray[j] - 1) * countArray[i]) / 2;
                }
//considering those triplets for which (arr[i]+arr[j]+arr[k])%m==0 and every element belongs to different bucket
//i.e. when all are different remainders
                else {
                    ans += countArray[i] * countArray[j] * countArray[k];
                }
            }
        }

        return ans;
    }

    private static int getCountOfTripletsBruteForce(int[] arr, int m) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((arr[i] + arr[j] + arr[k]) % m == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
