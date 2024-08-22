package LLD_3.TIcTacToe.Strategies;

import LLD_3.TIcTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficulty) {
        switch (difficulty) {
            case EASY:
                return new EasyBotPlayingStrategy();

            default:
                return new EasyBotPlayingStrategy();
        }
    }
}
