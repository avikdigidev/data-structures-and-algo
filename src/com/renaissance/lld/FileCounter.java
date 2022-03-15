package com.renaissance.lld;

public class FileCounter {
    public static void main(String[] args) {
        System.out.println(StaticVariables.count);
        StaticVariables s1 = new StaticVariables("first");
        System.out.println(StaticVariables.count);
        StaticVariables s2 = new StaticVariables("second");
        System.out.println(StaticVariables.count);
        StaticVariables s3 = new StaticVariables("3rd");
        StaticVariables s4 = new StaticVariables("4");
        System.out.println(StaticVariables.count);
    }
}

class StaticVariables {
    public static int count;
    public String name;

    public StaticVariables(String name) {
        count++;
        this.name = name;
    }
}
