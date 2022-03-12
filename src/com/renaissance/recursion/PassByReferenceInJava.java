package com.renaissance.recursion;

public class PassByReferenceInJava {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 3;
        add(a,b);

        System.out.println("Result from main: " +(a+b));
        System.out.println("pass by reference: ");
        IntegerReference ao = new IntegerReference(a);
        IntegerReference bo = new IntegerReference(b);
        PassByReferenceInJava.add(ao,bo);
        System.out.println(ao.value);
        System.out.println(bo.value);
    }
    static void add(IntegerReference x,IntegerReference y) {
        System.out.println("Result from method for call by reference: " +(x.value+y.value));
    }

    public static void add(Integer a, Integer b){
        a = 10;
        System.out.println("Result from method: " +(a+b));
    }
}

class IntegerReference {
    int value;
    IntegerReference(int val) {
        this.value = val;
    }
}
