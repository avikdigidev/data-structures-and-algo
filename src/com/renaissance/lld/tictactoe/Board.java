package com.renaissance.lld.tictactoe;

public class Board implements GameBoard {
    private final char[][] board;
    private final int dimension;

    public Board(int dimension) {
        this.dimension = dimension;
        this.board = new char[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                this.board[i][j] = '.';
            }
        }
    }

    @Override
    public boolean isFull() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (this.board[i][j] == '.')
                    return false;
            }
        }
        return true;
    }

    @Override
    public void applyMove(Move currentMove, char symbol) {
        if (currentMove.getX()== '.')
            this.board[currentMove.getY()][currentMove.getX()] = symbol;

    }

    @Override
    public boolean hasWinningLine(char symbol) {
        return hasHorizontalWinningLine(symbol) || hasDiagonalWinningLine(symbol) || hasVerticalWinningLine(symbol);
    }

    private boolean hasVerticalWinningLine(char symbol) {
        for (int i = 0; i < dimension; i++) {
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
@Override
    public int getDimension() {
        return dimension;
    }
}
