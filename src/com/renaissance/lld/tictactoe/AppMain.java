package com.renaissance.lld.tictactoe;

public class AppMain {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(new Player('X'),new Player('O'), new Board());
        Result result= ticTacToe.start();
        if (result.isDraw()){
            System.out.println("Draw");
        }else{
            System.out.println("Player won with symbol"+ result.getWinner().getSymbol());
        }
    }
}
