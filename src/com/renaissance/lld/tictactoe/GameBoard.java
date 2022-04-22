package com.renaissance.lld.tictactoe;

public interface GameBoard {
    boolean isFull();

    void applyMove(Move currentMove, char symbol);

    boolean hasWinningLine(char symbol);

    int getDimension();
}
