package racingcar.controller;

import racingcar.model.RacingGame;
import racingcar.view.View;

public class RacingGameController {
    private RacingGame racingGame;
    private View view;

    public void run() {
        makeRacingGame();
    }

    private void makeRacingGame() {
        racingGame = new RacingGame(view.inputParticipants(), view.inputRounds());
    }

    public void playGame() {
        for (int i = 0; i < racingGame.getRounds(); i++) {
            racingGame.move();
            view.printResult(racingGame.getParticipants());
        }
    }
}
