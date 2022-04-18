package com.renaissance.lld.tictactoe;

import java.util.Scanner;

public class Player {
    private final char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    Move play() {
        System.out.println("fetching moves");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        return new Move(x,y);
    }

    public char getSymbol() {
        return symbol;
    }
}
