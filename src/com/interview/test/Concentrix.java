package com.interview.test;

import java.util.Arrays;

@FunctionalInterface
public interface Concentrix {

    void doSomething(int a);
}

class ClassA {

//emplsit -salary and name
    //emp names wheres salry is >10000
    //  List<String> empNames = empList.stream().filter(e-> e.getSalary>10000).map(e->e.getName()).collect(Collectors.toList());
//2 sorted arrays


    public static void main(String[] args) {
        Concentrix c = (int a) -> System.out.println(a);
        c.doSomething(5);


        int[] a1 = {7, 9, 10, 12};
        int[] a2 = {5, 8, 11, 15,16};

        int[] result = mergeTwoArrays(a1, a2);
        System.out.println(Arrays.toString(result));

        int[] a3 = {4,0,0,3,1,0,0,5,0};
        reArrangeZeros(a3);
        System.out.println(Arrays.toString(a3));
    }

    private static void reArrangeZeros(int[] a3) {
        int nonZeroCounter=0;
        int zeroCounter = 0;

        for (int i = 0; i < a3.length; i++) {
            if (a3[nonZeroCounter]!=0){
                nonZeroCounter++;
            }
            if (a3[zeroCounter]==0){
                zeroCounter++;
            }
           if (a3[i] >0){
                nonZeroCounter++;
            }

        }

    }

    private static int[] mergeTwoArrays(int[] a1, int[] a2) {
        int l1 = a1.length;
        int l2 = a2.length;
        int[] result = new int[l1 + l2];
        int p1 = 0, p2 = 0, r = 0;
        while (p1 < l1 && p2 < l2) {
            if (a1[p1] > a2[p2]) {
                result[r] = a2[p2];
                r++;
                p2++;
            } else if (a1[p1] < a2[p2]) {
                result[r] = a1[p1];
                r++;
                p1++;
            } else {
                result[r] = a1[p1];
                r++;
                p1++;
                p2++;
            }

        }
        while(p1<l1){
            result[r] = a1[p1];
            r++;
            p1++;
        }
        while(p2<l2){
            result[r] = a2[p2];
            r++;
            p2++;
        }

        return result;
    }

}