package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.validate.Validate;

import java.util.ArrayList;
import java.util.List;

import static racingcar.validate.Validate.*;

public class RacingGame {
    private final List<Car> participants;
    private final int rounds;
    private List<Car> winners;

    public RacingGame(String participants, String rounds) {
        validateParticipants(participants);
        validateRounds(rounds);
        this.rounds = Integer.parseInt(rounds);
        this.participants = splitParticipants(participants);
    }

    private List<Car> splitParticipants(String participants) {
        List<Car> temp = new ArrayList<>();
        for(String name : participants.split(",")) {
            temp.add(new Car(name));
        }
        return temp;
    }

    private void validateRounds(String rounds) {
        isBlank(rounds);
        isNumber(rounds);
    }

    private void validateParticipants(String participants) {
        isBlank(participants);
        isLetter(participants);
    }

    public void move() {
        for (Car participant : participants) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                participant.move();
            }
        }
    }
}
