package com.interview.test;

public class CapgeminiDifferentAccount {
    public static void main(String[] args) throws Exception {
/*        String input = "Anil";
        int vowelCount = getVowelCount(input);
        System.out.println(vowelCount);
        */
/*        String a = "Java";
        a.concat("1.8");
        System.out.println(a);
        a= a.concat("1.11");
        System.out.println(a);*/
        System.out.println(getTry());

    }

    private static int getTry() throws Exception {
        try {
            System.out.println("try");
            return 1;

        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("finally");
            return 3;
        }
    }

/*    private static int getVowelCount(String input) {
        if (input ==null || input.length()==0){
            return 0;
        }


        Arrays.asList(input.toCharArray()).parallelStream().filter(c ->{
            input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'
        })

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
        }

    }*/
}
