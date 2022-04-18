package com.renaissance.lld.tictactoe;

public class Board {
    private final char[][] board;

    public Board() {
        this.board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = '.';
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == '.')
                    return false;
            }
        }
        return true;
    }

    public void applyMove(Move currentMove, char symbol) {
        this.board[currentMove.getY()][currentMove.getX()] = symbol;
    }

    public boolean hasWinningLine(char symbol) {
        return hasHorizontalWinningLine(symbol) || hasDiagonalWinningLine(symbol) || hasVerticalWinningLine(symbol);
    }

    private boolean hasVerticalWinningLine(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (this.board[0][i] == symbol && this.board[1][i] == symbol && this.board[2][i] == symbol)
                return true;
        }
        return false;
    }

    private boolean hasDiagonalWinningLine(char symbol) {
        return (this.board[0][0] == symbol && this.board[1][1] == symbol && this.board[2][2] == symbol) || (this.board[2][0] == symbol && this.board[1][1] == symbol && this.board[0][2] == symbol);
    }

    private boolean hasHorizontalWinningLine(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (this.board[i][0] == symbol && this.board[i][1] == symbol && this.board[i][2] == symbol)
                return true;
        }
        return false;
    }
}
