package com.interview;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoForge {
    public static void main(String[] args) {
        String str = "CoForge";
        //first repeated char from string using stream api;
        //  Char c = Arrays.asList(str.toCharArray()).stream().filter(c -(str.equals()))
        int[] arr = {1, 5, 7, 10, 15};

//        extracted(arr);
        //numbers starting with 1


    }

/*    private static void extracted(int[] arr) {
        List<Integer> l = (List<Integer>) Arrays.asList(arr).stream()
                .mapToInt(i -> Arrays.stream(i))
                .filter(n -> Integer.toString(n).startsWith("1"))
               .collect(Collectors.toList());
    }*/


    
    
    @Test
    public void test_ShouldPrintValidNumbers(){
        CoForge c = new CoForge();
        int[] a = {1,2,23};
       int[] res=  c.checkNumbers(a);
        Assert.assertEquals(a,res);
        
    }

    private int[] checkNumbers(int[] a) {
        return null;
    }
}
