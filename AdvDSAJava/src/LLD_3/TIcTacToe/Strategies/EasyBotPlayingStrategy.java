package LLD_3.TIcTacToe.Strategies;

import LLD_3.TIcTacToe.models.Board;
import LLD_3.TIcTacToe.models.Cell;
import LLD_3.TIcTacToe.models.CellState;
import LLD_3.TIcTacToe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {

        for (List<Cell> row : board.getGrid()) {
            for (Cell cell : row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(new Cell(cell.getRow(), cell.getCol()), null);
                }
            }
        }
        return null;
    }
}

