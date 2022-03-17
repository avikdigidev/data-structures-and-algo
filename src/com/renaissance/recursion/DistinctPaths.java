package com.renaissance.recursion;

//for a given grid m*n, find the distinct paths from source(0,0) to destination (m-1,n-1)
public class DistinctPaths {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int pathCount = countPaths(0, 0, m, n);
        System.out.println(pathCount);
        //alternate approach
        int count = 0;
        CountRef countRef = new CountRef(count);
        countPaths(0, 0, m, n, countRef);
        System.out.println(countRef.value);
    }

    private static void countPaths(int i, int j, int m, int n, CountRef countRef) {
        if (i == m - 1 || j == n - 1) {
            countRef.value++;
            return;
        }
        countPaths(i, j + 1, m, n, countRef);
        countPaths(i + 1, j, m, n, countRef);

    }

    private static int countPaths(int i, int j, int m, int n) {
        if (i == m - 1 || j == n - 1) {
            return 1;
        }
        return countPaths(i, j + 1, m, n) + countPaths(i + 1, j, m, n);
    }
}

class CountRef {
    int value;

    CountRef(int value) {
        this.value = value;
    }
}
