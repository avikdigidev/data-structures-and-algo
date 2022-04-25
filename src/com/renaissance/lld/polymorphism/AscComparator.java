package com.renaissance.lld.polymorphism;

public class AscComparator implements Comparator {
    @Override
    public boolean compare(int a, int b) {
        return a <= b;
    }
}
