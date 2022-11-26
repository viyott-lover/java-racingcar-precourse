package racingcar.controller;

import racingcar.model.Participant;
import racingcar.model.RacingGame;
import racingcar.model.Round;
import racingcar.view.View;

import static racingcar.validate.Task.reTryTaskUntilSuccessful;

public class RacingGameController {
    private RacingGame racingGame;
    private final View view = new View();

    public void run() {
        makeRacingGame();
        playGame();
        printWinners();
    }

    private void makeRacingGame() {
        Participant participants = reTryTaskUntilSuccessful(() -> new Participant(view.inputParticipants()));
        Round round = reTryTaskUntilSuccessful(() -> new Round(view.inputRounds()));
        racingGame = new RacingGame(participants, round);
    }

    private void playGame() {
        for (int i = 0; i < racingGame.getRound(); i++) {
            racingGame.move();
            view.printResult(racingGame.getParticipants());
        }
    }

    private void printWinners() {
        racingGame.selectWinners();
        view.printWinners(racingGame.getWinners());
    }
}
