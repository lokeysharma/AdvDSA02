package LLD_3.TIcTacToe.models;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Symbol {
    private char sym;

    public Symbol(char sym) {
        this.sym = sym;
    }
}
