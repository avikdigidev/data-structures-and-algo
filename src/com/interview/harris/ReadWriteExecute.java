package com.interview.harris;

//public class Harris {

import java.util.HashMap;

public class ReadWriteExecute {

    public static int symbolicToInt(String permString) {

        HashMap<Character, Integer> hmn = new HashMap<>();
        hmn.put('r', 4);
        hmn.put('w', 2);
        hmn.put('x', 1);
        hmn.put('-', 0);

        char[] charsOfInput = permString.toCharArray();
        int counter = 0;
        int t = 0, h = 0, o = 0;
//ones tens hunderds
        for (int i = 0; i < charsOfInput.length; i++) {

            if (counter > 5) {

                o += toValue(charsOfInput[i], hmn);
            } else if (counter > 2) {
                t += toValue(charsOfInput[i], hmn);

            } else if(counter <= 2 ){
                h += toValue(charsOfInput[i], hmn);

            }
            counter++;
        }
        int result = (h * 100) + (t * 10) + o;

        return result;
        // throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    private static int toValue(char c, HashMap<Character, Integer> hmn) {
        return hmn.get(c);

    }

    public static void main(String[] args) {
        // Should write 752
        System.out.println(ReadWriteExecute.symbolicToInt("rwxr-x-w-"));
    }
}
//}
