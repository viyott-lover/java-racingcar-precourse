package racingcar.controller;

import racingcar.model.RacingGame;
import racingcar.view.View;

public class RacingGameController {
    private RacingGame racingGame;
    private final View view = new View();

    public void run() {
        makeRacingGame();
        playGame();
        printWinners();
    }

    private void makeRacingGame() {
        racingGame = new RacingGame(view.inputParticipants(), view.inputRounds());
    }

    private void playGame() {
        for (int i = 0; i < racingGame.getRounds(); i++) {
            racingGame.move();
            view.printResult(racingGame.getParticipants());
        }
    }

    private void printWinners() {
        racingGame.selectWinners();
        view.printWinners(racingGame.getWinners());
    }
}
