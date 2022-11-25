package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RacingGame {
    private List<Car> participants;
    private List<Car> winners;
    private int rounds;

    RacingGame(int rounds) {
        this.rounds = rounds;
    }

    public void move() {
        for (Car participant : participants) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                participant.move();
            }
        }
    }
}
