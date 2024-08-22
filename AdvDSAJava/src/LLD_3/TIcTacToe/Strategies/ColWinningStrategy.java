package LLD_3.TIcTacToe.Strategies;

import LLD_3.TIcTacToe.models.Board;
import LLD_3.TIcTacToe.models.Move;
import LLD_3.TIcTacToe.models.Symbol;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy{

    HashMap<Integer, HashMap<Symbol,Integer>> counts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int c = move.getCell().getCol();
        Symbol symbol = move.getCell().getSymbol();

        if(!counts.containsKey(c)){
            counts.put(c, new HashMap<>());
        }

        HashMap<Symbol,Integer> col = counts.get(c);
        if(!col.containsKey(symbol)){
            col.put(symbol, 0);
        }
        col.put(symbol, col.get(symbol) + 1);

        return col.get(symbol) == board.getSize();
    }
    @Override
    public void handleUndo(Board board, Move move) {
        int c = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();
        counts.get(c).put(symbol, counts.get(c).get(symbol) - 1);
    }
}
