package LLD_3.TIcTacToe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {

    private int row;
    private int col;
    private Symbol symbol;
    private CellState cellState;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }

    public void displayCell(){
        // cell can be empty
        if(cellState == CellState.EMPTY){
            System.out.print("| - |");
        }
        // p[resent with some symbols

        else{
            System.out.print("| "+symbol.getSym()+ " |");
        }
    }

}
