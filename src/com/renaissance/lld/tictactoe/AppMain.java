package com.renaissance.lld.tictactoe;

public class AppMain {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(new Computer('X'),new Computer('O'), new Board(3));
        Result result= ticTacToe.start();
        if (result.isDraw()){
            System.out.println("Draw");
        }else{
            System.out.println("Player won with symbol"+ result.getWinner().getSymbol());
        }
    }
}
