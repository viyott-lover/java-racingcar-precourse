package racingcar.model;

import racingcar.validate.Validate;

import static racingcar.validate.Validate.*;

public class Round {
    private int round;

    Round(String round) {
        validateRound(round);
        this.round = round;
    }

    private void validateRound(String round) {
        isBlank(round);
        isNumber(round);

    }
}
