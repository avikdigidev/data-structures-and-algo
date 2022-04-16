package com.codesignal.arcade.intro;

public class ReverseInParentheses {
    public static void main(String[] args) {
        String s = reverseInsideParanthesis("foo(bar)blim"); //"foorabblim"

        System.out.println(s);
    }

    private static String reverseInsideParanthesis(String s) {
        char[] inputStringArray = s.toCharArray();
        int start = -1, end = -1;
        int first = -1,last =-1;
        int parCounter=0;
        for (int i = 0; i < inputStringArray.length; i++) {
            if (inputStringArray[i] == '(') {
                parCounter++;
                start = i + 1;
                first = i;
            }
            if (inputStringArray[i] == ')') {
                end = i - 1;
                last = i-1;
            }
        }
        while (start < end) {
            char temp = inputStringArray[start];
            inputStringArray[start] = inputStringArray[end];
            inputStringArray[end] = temp;
            start++;
            end--;
        }
        deleteParanthesesAt(first,inputStringArray);
        deleteParanthesesAt(last,inputStringArray);
        return String.valueOf(inputStringArray).trim();
    }

    private static void deleteParanthesesAt(int first, char[] arr) {
        for (int i = first; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        if (first==arr.length){
            arr[first]=' ';
        }else{
            arr[arr.length-1]=' ';
        }
    }
}



