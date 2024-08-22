package LLD_3.TIcTacToe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public abstract class Player {

    private Long id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner sc = new Scanner(System.in);

    public Player(Long id, String name, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    public Move MakeMove(Board board){
        System.out.println("Please enter the row ");
        int r = sc.nextInt();
        System.out.println("Please enter the column ");
        int c = sc.nextInt();

        return new Move(new Cell(r,c),this);
    }
}
