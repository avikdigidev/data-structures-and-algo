package com.gfg.crash.dsa.sprint;

public class BiTonicPlant {
    public static void main(String[] args) {
        int n = 9;
        int arr[] = {1, 15, 25, 45, 425, 21, 17, 12, 11};
        System.out.println("" + arr[getPeak(arr, n)]);
    }

    private static int getPeak(int[] arr, int n) {
        return getPeakUtil(arr, 0, n - 1, n);
    }

    private static int getPeakUtil(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
return mid;
        }else if (mid>0 && arr[mid - 1] >= arr[mid]){
            return   getPeakUtil(arr,low, mid-1,n);
        }else {
            return     getPeakUtil(arr,mid+1, high,n);
        }
    }
}
