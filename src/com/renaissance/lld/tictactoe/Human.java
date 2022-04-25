package com.renaissance.lld.tictactoe;

import java.util.Scanner;

public class Human implements Player {
    private final char symbol;

    public Human(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public Move play() {
        System.out.println("human moves");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        return new Move(x, y);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
