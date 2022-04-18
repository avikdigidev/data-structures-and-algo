package com.renaissance.lld.tictactoe;

public class Result {
    private final boolean isDraw;
    private final Player winner;
    public Result(boolean isDraw, Player currentPlayer) {
        this.isDraw=isDraw;
        this.winner=currentPlayer;
    }

    public boolean isDraw() {
        return isDraw;
    }

    public Player getWinner() {
        return winner;
    }
}
