package LLD_3.TIcTacToe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Board {
    private int size;
    private List<List<Cell>> grid;

    public Board(int size) {
        this.size = size;
        this.grid = new ArrayList<>();
        // create the grid.
        for (int i = 0; i < size; i++) {
            grid.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                grid.get(i).add(new Cell(i,j));
            }
        }
    }

    public void DisplayBoard(){
        for(List<Cell> row : grid){
            for(Cell cell : row){
                cell.displayCell();
            }
            System.out.println();
        }

        System.out.println("------------");;
    }

}
