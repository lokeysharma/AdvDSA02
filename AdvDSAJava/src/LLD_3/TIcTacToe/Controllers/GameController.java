package LLD_3.TIcTacToe.Controllers;

import LLD_3.TIcTacToe.Strategies.WinningStrategy;
import LLD_3.TIcTacToe.models.Game;
import LLD_3.TIcTacToe.models.GameState;
import LLD_3.TIcTacToe.models.Player;

import java.util.List;

public class GameController {
//    Game game;
//
//    public GameController() {
//        this.game = new Game();
//    }

    public Game StartGame(
            int dimension,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public GameState GetGameState(Game game){
        return game.getGameState();
    }

    public void Undo(Game game){
        game.undo();
    }

    public void DisplayBoard(Game game){
        game.Display();
    }

    public void MakeMove(Game game){
        game.MakeMove();
    }

    public Player GetWinner(Game game){
        return game.getWinner();
    }
}



/*
* 1 to create the game  : size, board, players and start the game
* 2 display the empty board
* 3 a player will make a move
* 4 check if a winner is selected or no moves are left ie draw
* 5 repeat step 2 to 4
*
* 6 undo functionality
*  */