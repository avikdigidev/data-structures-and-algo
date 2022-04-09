package com.renaissance.lld.polymorphism;

public class SortingUtility {
// no change required in this logic even for asc, desc, or absolute
    public static  void sort(int[] arr, Comparator comparator){
        for (int i = 0; i < arr.length; i++) {
            int j =i;
            while (j>0 && !comparator.compare(arr[j-1],arr[j] )){
                int temp =arr[j];
                arr[j]=arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
    }
}
