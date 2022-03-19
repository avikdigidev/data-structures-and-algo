package com.renaissance.recursion;

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

        String input = "437";
        getCombination("", input, keypad, 0);

    }

    private static void getCombination(String result, String input, HashMap<Integer, Character[]> keypad, int index) {
        if (input.length() == index) {
            System.out.println(result);
            return ;
        }
        char current = input.charAt(index);
        int keypadIndex = current - '2'; //why are we doing this? is there a better approach?

        for (int i = 0; i < keypad.get(keypadIndex).length; i++) {
            String ansSoFar = result + keypad.get(keypadIndex)[i];
            getCombination(ansSoFar,input, keypad,index+1);
        }

    }
}
