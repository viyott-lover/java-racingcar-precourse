package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RacingGame {
    private List<Car> participants;
    private List<Car> winners;
    private int rounds;

    public RacingGame(String participants, String rounds) {
        validateParticipants(participants);
        validateRounds(rounds);
        this.rounds = rounds;
    }

    private void validateRounds(String rounds) {
    }

    private void validateParticipants(String participants) {
    }

    public void move() {
        for (Car participant : participants) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                participant.move();
            }
        }
    }
}
