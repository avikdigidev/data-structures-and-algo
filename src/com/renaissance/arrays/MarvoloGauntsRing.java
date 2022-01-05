package com.renaissance.arrays;

import java.util.Scanner;
/*Professor Dumbledore is helping Harry destroy the Horcruxes.
He went to Gaunt Shack as he suspected a Horcrux to be present there.
He saw Marvolo Gaunt's Ring and identified it as a Horcrux.
Although he destroyed it, he is still affected by its curse.
Professor Snape is helping Dumbledore remove the curse.
For this, he wants to give Dumbledore exactly x drops of the potion he made.

Value of x is calculated as maximum of p·ai+q·aj+r·ak for given p,q,r and array a1,a2,... an such that 1≤i≤j≤k≤n.
Help Snape find the value of x. Do note that the value of x may be negative.

Input
First line of input contains 4 integers n,p,q,r (-10^9≤p,q,r≤10^9,1≤n≤10^5).

Next line of input contains n space separated integers a1,a2,... an (-10^9≤ai≤10^9).

Output
Output a single integer the maximum value of p·ai+q·aj+r·ak that can be obtained provided 1≤i≤j≤k≤n.

Examples
inputCopy
5 1 2 3
1 2 3 4 5
outputCopy
30
inputCopy
5 1 2 -3
-1 -2 -3 -4 -5
outputCopy
12
* */
public class MarvoloGauntsRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long p = sc.nextLong();
        long q = sc.nextLong();
        long r = sc.nextLong();

        long[] arr = new long[n]; //
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        long[] prefixMax = getPrefixMax(arr, n, p);
        long[] suffixMax = getSuffixMax(arr, n, r);
        long ans = Long.MIN_VALUE;

        for (int y = 1; y <= n - 1; y++) {

            long first = prefixMax[y];
            long mid = q * arr[y];
            long last = suffixMax[y];
            ans = Long.max(ans, first + mid + last);
        }
        System.out.print( ans);
    }

    private static long[] getSuffixMax(long[] arr, int n, long c) {
        long sMax[] = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                sMax[i] = c * arr[i];
            } else {
                sMax[i] = (sMax[i + 1] > c * arr[i]) ? sMax[i + 1] : c * arr[i];
            }
        }
        return sMax;
    }

    private static long[] getPrefixMax(long[] arr, int n, long a) {
        long[] pMax = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                pMax[i] = a * arr[i];
            } else {
                pMax[i] = (pMax[i - 1] > a * arr[i]) ? pMax[i - 1] : a * arr[i];
            }
        }
        return pMax;
    }
}
