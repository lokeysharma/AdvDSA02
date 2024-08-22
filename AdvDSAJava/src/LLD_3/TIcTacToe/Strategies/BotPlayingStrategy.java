package LLD_3.TIcTacToe.Strategies;

import LLD_3.TIcTacToe.models.Board;
import LLD_3.TIcTacToe.models.Move;

public interface BotPlayingStrategy {

    public Move makeMove(Board board);
}
