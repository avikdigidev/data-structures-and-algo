package com.renaissance.arrays;
// Java Implementation of Right Rotation
// of an Array K number of times

public class RotateArrayClockwiseKTimes {

    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5};
        int array2[] = {6, 2, 3, 4, 5};
        int n = array.length;

        int k = 2;
        rightRotate(array, k);

    }

    // Function to rightRotate array
    static void rightRotate(int a[], int k) {
        int n = a.length;
        // If rotation is greater
        // than size of array
        k = k % n;

        for (int i = 0; i < n; i++) {
            if (i < k) {
                // Printing rightmost kth elements
                System.out.print(a[n + i - k]
                        + " ");
            } else {
                // Prints array after
                // 'k' elements
                System.out.print(a[i - k]
                        + " ");
            }
        }
        System.out.println();
    }

    static void approach2(int[] array, int k) {
        int N = array.length;
        // Reverse all the array elements
        for (int i = 0; i < N / 2; i++) {
            int temp = array[i];
            array[i] = array[N - i - 1];
            array[N - i - 1] = temp;
        }

        // Reverse the first k elements
        for (int i = 0; i < k / 2; i++) {
            int temp = array[i];
            array[i] = array[k - i - 1];
            array[k - i - 1] = temp;
        }

        // Reverse the elements from K
        // till the end of the array
        for (int i = 0; i < (k + N) / 2; i++) {
            int temp = array[(i + k) % N];
            array[(i + k) % N] = array[(N - i + k - 1) % N];
            array[(N - i + k - 1) % N] = temp;
        }

        // Print the array after rotation
        for (int i = 0; i < N; i++) {

            System.out.print(array[i] + " ");
        }

    }
}
