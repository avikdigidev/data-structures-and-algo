package com.renaissance.lld.polymorphism;

public class AbsComparator implements Comparator {
    @Override
    public boolean compare(int a, int b) {
        return Math.abs(a) <= Math.abs(b);
    }
}
