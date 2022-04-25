package com.renaissance.lld.tictactoe;
/*Design a tic tac toe, 2 players - 'O' and 'X'
*
* Players should be able to take turns 1 after the other
* There is 3x3 board
* 2 players play the game
* each player makes a move alternatively
* either a symbol 'O' or 'X' is assigned to the players
* In each move, player puts symbol on an empty cell of board.
* Game termination case:
*   Either the board is full: Draw
*   Or there is a straight line vertical/diagonal/horizontal containing the same symbol: winner is symbol owner
*
* Step 2 Nouns:
* Identification of entities: Board, Player, Game, Symbol, Move
*         Game
*       /       \
*      Player   Board
*     /       \
*   X          O
*
* */
public class TicTacToe {
    private final Player player1, player2;
    private final GameBoard board;


    public TicTacToe(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    Result start(){
        Player currentPlayer = this.player1;
        while(!this.board.isFull()){
            Move currentMove = currentPlayer.play();
            this.board.applyMove(currentMove,currentPlayer.getSymbol());
            if (this.board.hasWinningLine(currentPlayer.getSymbol())){
                System.out.println("The game is finished");
                return  new Result(false,currentPlayer);
            }
            currentPlayer= (currentPlayer== this.player1)?player2: player1 ;

        }
        return  new Result(true,null);
    }
}
