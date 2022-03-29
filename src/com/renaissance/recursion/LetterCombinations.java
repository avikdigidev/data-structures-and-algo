package com.renaissance.recursion;

import java.util.Arrays;
import java.util.HashMap;

public class LetterCombinations {
    public static void main(String[] args) {
        HashMap<Integer, Character[]> keypad = new HashMap<>();
        keypad.put(0, new Character[]{'a', 'b', 'c'});
        keypad.put(1, new Character[]{'d', 'e', 'f'});
        keypad.put(2, new Character[]{'g', 'h', 'i'});
        keypad.put(3, new Character[]{'j', 'k', 'l'});
        keypad.put(4, new Character[]{'m', 'n', 'o'});
        keypad.put(5, new Character[]{'p', 'q', 'r', 's'});
        keypad.put(6, new Character[]{'t', 'u', 'v'});
        keypad.put(7, new Character[]{'w', 'x', 'y', 'z'});

        String input = "23";
       // getCombination("", input, keypad, 0);
        char[] result = new char[input.length()+1];
        int i = 0;
        TempArrayRef tempArrayRef = new TempArrayRef(result);
        getCombinationEfficiently(tempArrayRef, i, input, keypad);
    }

    private static void getCombinationEfficiently(TempArrayRef result, int index, String input, HashMap<Integer, Character[]> keypad) {
        if (input.length() == index) {
            System.out.println(Arrays.toString(result.value));
            return;
        }
        char current = input.charAt(index);
        int keypadIndex = current - '2';

        for (int i = 0; i < keypad.get(keypadIndex).length; i++) {
            result.value[i] = keypad.get(keypadIndex)[i];
            getCombinationEfficiently(result, index + 1, input, keypad);
        }
    }

    private static void getCombination(String result, String input, HashMap<Integer, Character[]> keypad, int index) {
        if (input.length() == index) {
            System.out.println(result);
            return;
        }
        char current = input.charAt(index);
        int keypadIndex = current - '2';
        /*why are we doing this? is there a better approach?
            Because we have stored the letters for keypad 2 in keypad[0], and not in keypad[2].
            keypad.put(0, new Character[]{'a', 'b', 'c'});
            If you want to avoid subtracting, replace 0 with 2 in keypad.put.
            And do the same for other digits as well.
         */

        for (int i = 0; i < keypad.get(keypadIndex).length; i++) {
            String ansSoFar = result + keypad.get(keypadIndex)[i];
            getCombination(ansSoFar, input, keypad, index + 1);
        }

    }
}
class TempArrayRef {
    char[] value;

    TempArrayRef(char[]  value) {
        this.value = value;
    }
}
