package com.interview;

import java.util.Objects;

public class Iris {
    private String name;

    public static void main(String[] args) {
        int n = 5;
        int fact = getFactorial(n);
        System.out.println(fact);
    }

    private static int getFactorial(int n) {
        if (n == 1) return 1;
        return n * getFactorial(n - 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iris iris = (Iris) o;
        return Objects.equals(name, iris.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    } // jvm and architecture, hashcode, memory management --VVIMP //ranjit ramachandran
    //2 services


}
