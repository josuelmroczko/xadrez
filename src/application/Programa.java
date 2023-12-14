package application;

import bordGame.Board;
import chess.ChessMatch;


public class Programa {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        Ui. printBoard(chessMatch.getPieces());
    }
}
