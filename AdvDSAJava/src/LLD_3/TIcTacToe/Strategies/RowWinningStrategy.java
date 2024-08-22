package LLD_3.TIcTacToe.Strategies;

import LLD_3.TIcTacToe.models.Board;
import LLD_3.TIcTacToe.models.Move;
import LLD_3.TIcTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{

    HashMap<Integer, HashMap<Symbol,Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int r = move.getCell().getRow();
        Symbol symbol = move.getCell().getSymbol();

        if(!counts.containsKey(r)){
            counts.put(r, new HashMap<>());
        }

        HashMap<Symbol,Integer> row = counts.get(r);
        if(!row.containsKey(symbol)){
            row.put(symbol, 0);
        }
        row.put(symbol, row.get(symbol) + 1);

        return row.get(symbol) == board.getSize();
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int r = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();
        counts.get(r).put(symbol, counts.get(r).get(symbol) - 1);
    }
}
