package com.renaissance.maths;

public class CountingTriplets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int m = 8;
        int count = getCountOfTripletsBruteForce(arr, m); //O(N^3)
        int count2 = getCountOfTripletsEfficiently(arr,m);

        System.out.println(count);
    }

    private static int getCountOfTripletsEfficiently(int[] arr, int k) {
        int count =0;
        int n= arr.length;
        //Law of modularity states that: (a+b)%k = ((a%k)+ (b%k))%k
        //in other words remainders of sum = sum of remainders%k By using this...
        //and also the value of (any number %k) will lie between [0...k-1] periodically
        int ans = 0;

        int[] countArray = new int[k];
        for (int i = 0; i < k; i++) {
            countArray[i] = 0; //initializing the count to 0
        }
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            countArray[arr[i] % k]++; //increasing the count value at the index whenever we get the corresponding value
        }
        //considering those triplets for which (arr[i]+arr[j]+arr[k])%k==0
        ans += (countArray[0] * (countArray[0] - 1)*(countArray[0] - 2)) / 6; //ncr = n!/r!(n-r)! => for triplets n*(n-1)(n-2)/6

//fixing 1st 2 remainders

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
