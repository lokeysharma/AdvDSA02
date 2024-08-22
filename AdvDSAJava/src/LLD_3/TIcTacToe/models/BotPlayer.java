package LLD_3.TIcTacToe.models;

import LLD_3.TIcTacToe.Strategies.BotPlayingStrategy;
import LLD_3.TIcTacToe.Strategies.BotPlayingStrategyFactory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BotPlayer extends Player{

    private BotDifficultyLevel difficulty;
    private BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(Long id, String name, Symbol symbol, BotDifficultyLevel difficulty) {
        super (id,name,symbol);
        this.setPlayerType(PlayerType.BOT);
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficulty);
        this.difficulty = difficulty;
    }

    public Move MakeMove(Board board){
        Move move = botPlayingStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
    }
}
