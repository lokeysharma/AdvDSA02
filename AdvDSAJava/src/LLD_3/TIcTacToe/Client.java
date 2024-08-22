package LLD_3.TIcTacToe;

import LLD_3.TIcTacToe.Controllers.GameController;
import LLD_3.TIcTacToe.Strategies.ColWinningStrategy;
import LLD_3.TIcTacToe.Strategies.RowWinningStrategy;
import LLD_3.TIcTacToe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        List<Player> players = new ArrayList<Player>();
        Scanner scanner = new Scanner(System.in);
        players.add(new HumanPlayer(1L,"Lokey", new Symbol('X')));
        players.add(new BotPlayer(2L,"BHOT01", new Symbol('O'), BotDifficultyLevel.EASY ));
        Game game = gameController.StartGame(3,players, List.of(new RowWinningStrategy(), new ColWinningStrategy()));

        gameController.DisplayBoard(game);
        while(gameController.GetGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.MakeMove(game);
            gameController.DisplayBoard(game);
            System.out.println("Do any one wants to undo? [Y/N]");
            String undoAns = scanner.nextLine();
            if(undoAns.equalsIgnoreCase("Y")){
                gameController.Undo(game);
                gameController.DisplayBoard(game);
            }

        }

        if(gameController.GetGameState(game).equals(GameState.SUCCESS)){
            System.out.println(gameController.GetWinner(game).getName() + " won the game");
        }
        else  if(gameController.GetGameState(game).equals(GameState.DRAW)){
            System.out.println("gameController.GetWinner(game)");
        }
    }


}
// Tic Tac Toe

// Create package
// Converting your class diagram into models