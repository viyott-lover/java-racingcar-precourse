package racingcar;

import java.util.List;

public class RacingGame {
    private List<Car> participants;
    private List<Car> winners;
    private int rounds;

    RacingGame(int rounds) {
        this.rounds = rounds;
    }
}
