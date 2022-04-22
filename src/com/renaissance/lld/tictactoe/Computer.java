package com.renaissance.lld.tictactoe;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Computer implements Player {
    private final char symbol;

    public Computer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public Move play() {
        int x = ThreadLocalRandom.current().nextInt(1,20)%3;
        int y = ThreadLocalRandom.current().nextInt(1,20)%3;
        System.out.println("computer moves"+": "+x+","+y);
        return new Move(x, y);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
