package LLD_3.TIcTacToe.models;

import LLD_3.TIcTacToe.Strategies.WinningStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {

    private Long id;
    private Board board;
    private List<Player> players;
    private Player winner;
    private int nextPlayerIndex;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder) {
        board = new Board(builder.dimension);
        this.players = builder.players;
        this.winner = null;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
        this.winningStrategies = builder.winningStrategies;

    }

    public void Display(){
        board.DisplayBoard();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public boolean validateMove (Move move){
        int r = move.getCell().getRow();
        int c = move.getCell().getCol();

        if(r<0 || r> board.getSize()-1 || c<0 || c> board.getSize()-1){
            return false;
        }

        if(!board.getGrid().get(r).get(c).getCellState().equals(CellState.EMPTY)){
            return false;
        }
        return true;
    }
    public void MakeMove() {
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println("It's " + currentPlayer.getName() + "'s move, Please make your move.");
        Move move = currentPlayer.MakeMove(board);
        if(!validateMove(move)){
            System.out.println("Invalid move, try Again");
            return;
        }

        int r = move.getCell().getRow();
        int c = move.getCell().getCol();

        Cell cellToChange = board.getGrid().get(r).get(c);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getSymbol());

        move.setCell(cellToChange);
        moves.add(move);

        nextPlayerIndex = (nextPlayerIndex + 1) % players.size();
        if(CheckWinner(move)){
            setWinner(currentPlayer);
            setGameState(gameState.SUCCESS);
        }
        else if(moves.size() == board.getSize()*board.getSize()){
            setWinner(null);
            setGameState(gameState.DRAW);
        }
    }

    public boolean CheckWinner(Move move){
        // we need to chek all the staregy which are available and cehk if tha make a winner ot not
        for(WinningStrategy strategy : winningStrategies){
            if(strategy.checkWinner(this.board,move)){
                return true;
            }
        }
        return false;
    }

    public void undo() {
        if(!moves.isEmpty()){
            Move move = moves.getLast();
            move.getCell().setCellState(CellState.EMPTY);
            move.getCell().setSymbol(null);
            moves.removeLast();

            nextPlayerIndex --;
            nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();

            for(WinningStrategy strategy : winningStrategies){
                strategy.handleUndo(board,move);
            }

        }
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;


        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build(){
            return new Game(this);
        }
    }


}
