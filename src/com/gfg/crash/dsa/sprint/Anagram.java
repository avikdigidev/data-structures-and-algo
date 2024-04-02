package com.gfg.crash.dsa.sprint;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("geeksforgeeks", "forgeeksgeeks"));
    }
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {
        if (a==null || b==null || a.length()!=b.length()){
            return false;
        }
        Map<Character,Integer> cMap = new HashMap<>();
        char aChars[] = a.toCharArray();
        char[] bChars = b.toCharArray();
        for (int i = 0; i < aChars.length; i++) {
            cMap.put(aChars[i], cMap.getOrDefault(aChars[i], 0)+1);
        }
        for (int i = 0; i < bChars.length; i++) {
            cMap.put(bChars[i], cMap.getOrDefault(bChars[i], 0)-1);
        }

        for(Map.Entry<Character,Integer> e : cMap.entrySet()){
            if (e.getValue()!=0){
                return false;
            }
        }
return true;
    }
}
