package com.gfg.crash;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int n = arr.length;
        int target = 6;
        int result1 = binarySearchRecursion(arr, 0, n, target);
        int result = binarySearch(arr, n, target);
        System.out.println("Iterative Binary Search : " + result);
        System.out.println("Recusrsion Binary Search : " + result1);
        int binarySearchTest = binarySearchTest(arr, n, target);
        System.out.println("Test Binary Search iterative: " + binarySearchTest);
        int[] binArray = {1, 1};
        int size = binArray.length;
        int countOfOne = getCountOfOne(binArray, size);
        System.out.println("Total no of 1's are: " + countOfOne);
        System.out.println("Sqrt root :" + getSquareRoot(16));
    }

    private static long getSquareRoot(long n) {
        long start = 0, end = n;
        float sqrt = 0f;
        while (start <= end) {
            long mid = (start + end) / 2;
            long mid_2 = mid * mid;
            if (mid_2 == n) {
                return (long) Math.floor(mid);
            } else if (mid_2 < n) {
                start = mid + 1;
                sqrt = mid;

            } else {
                end = mid - 1;
            }
        }
        float inc = 0.1f;
        for (int i = 0; i < 1; i++) {
            while (sqrt * sqrt <= n) {
                sqrt += inc;
            }
            sqrt = (sqrt - inc);
            inc = inc / 10;

        }
        return (long) sqrt;
    }

    private static int getCountOfOne(int[] binArray, int n) {
        int start = 0;
        int end = n - 1;

        int counter = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (start == end) {
                if (binArray[start] == 1) {
                    counter = mid;
                    return counter + 1;
                } else {
                    return 0;
                }

            }
            if (binArray[mid] == 1) {
                if (binArray[mid + 1] == 0) {
                    end = mid;
                    counter = mid;
                } else if (binArray[mid + 1] == 1) {
                    start = mid + 1;
                    counter = mid + 1;
                }
            } else if (binArray[mid] == 0) {

                end = mid - 1;
                counter = mid - 1;


            }

        }
        return counter + 1;
    }

    private static int linerSearch_unsoretedArray(int arr[], int N, int X) {

        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearchTest(int[] arr, int n, int target) {
        {
            int start = 0;
            int end = n - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] > target) {
                    end = mid - 1;

                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
            // Your code here
            return -1;
        }
      /*  int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;*/
    }

    private static int binarySearch(int[] arr, int n, int target) {
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int binarySearchRecursion(int[] arr, int start, int end, int target) {

        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;

        } else if (arr[mid] < target) {
            return binarySearchRecursion(arr, mid + 1, end, target);
        } else {
            return binarySearchRecursion(arr, start, mid - 1, target);
        }

    }
}
