package ai;

import tictactoe.Board;

public class Algorithms {

    private Algorithms() {}

    public static void random (Board board) {
        Random.run(board);
    }

    public static void alphaBetaPruning (Board board) {
        AlphaBetaPruning.run(board.getTurn(), board, Double.POSITIVE_INFINITY);
    }

//    public static void alphaBetaPruning (Board board, int ply) {
//        AlphaBetaPruning.run(board.getTurn(), board, ply);
//    }


}
