package com.renaissance.recursion;

public class PassByReferenceInRecursion {
    public static void main(String[] args) {
        int x = 0;
        IntegerReference xRef = new IntegerReference(x);
        recursiveFunction(xRef);

    }

    private static void recursiveFunction(IntegerReference xRef) {
        System.out.println(xRef.value);
        if (xRef.value >= 3) {
            return;
        }
        xRef.value++;
        recursiveFunction(xRef);
        xRef.value++;
        recursiveFunction(xRef);
    }
}

class IntegerRef {
    int value;

    IntegerRef(int value) {
        this.value = value;
    }
}