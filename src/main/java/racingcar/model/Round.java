package racingcar.model;

import racingcar.validate.Validate;

import static racingcar.validate.Validate.*;

public class Round {
    private int round;

    public Round(String round) {
        validateRound(round);
        this.round = Integer.parseInt(round);
    }

    private void validateRound(String round) {
        isBlank(round);
        isNumber(round);
    }

    public int getRound() {
        return round;
    }
}
