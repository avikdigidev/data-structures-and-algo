package com.codesignal.arcade.intro;

public class IsIpv4Address {
    public static void main(String[] args) {
        System.out.println(solution("0.254.255.0"));
    }

    static boolean solution(String inputString) {
        String[] split = inputString.split("\\.");
        if(split.length!=4) return false;
        for (String s : split) {
            try {
                if (s.length() < 0 || Integer.parseInt(s) > 255) {
                    return false;
                }
                if(s.length()>1 && s.startsWith("0")){
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;

    }

}
