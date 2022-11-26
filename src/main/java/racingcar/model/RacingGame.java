package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static racingcar.validate.Validate.*;

public class RacingGame {
    private final Participant participants;
    private final Round round;
    private List<Car> winners;

    public RacingGame(Participant participants, Round round) {
        this.participants = participants;
        this.round = round;
    }

    public void move() {
        for (Car participant : participants.getParticipants()) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                participant.move();
            }
        }
    }

    public void selectWinners() {
        winners = new ArrayList<>(participants.getParticipants());
        Car winningCar = winners.stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .get();
        winners = winners.stream()
                .filter(e -> e.isSamePosition(winningCar.getPosition()))
                .collect(Collectors.toList());

    }

    public int getRound() {
        return round.getRound();
    }

    public List<Car> getParticipants() {
        return participants.getParticipants();
    }

    public List<Car> getWinners() {
        return winners;
    }
}
