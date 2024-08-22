package LLD_3.TIcTacToe.Strategies;

import LLD_3.TIcTacToe.models.Board;
import LLD_3.TIcTacToe.models.Move;

public interface WinningStrategy {

    public boolean checkWinner(Board board, Move move);
    public void handleUndo(Board board, Move move);

}
