package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static racingcar.validate.Validate.*;

public class RacingGame {
    private final List<Car> participants;
    private final int rounds;
    private List<Car> winners;

    public RacingGame(String participants, String rounds) {
        validateRounds(rounds);
        this.rounds = Integer.parseInt(rounds);
        this.participants = splitParticipants(participants);
    }

    private void validateRounds(String rounds) {
        isBlank(rounds);
        isNumber(rounds);
    }

    private List<Car> splitParticipants(String participants) {
        List<Car> temp = new ArrayList<>();
        validateParticipants(participants);
        for (String name : participants.split(",")) {
            temp.add(new Car(name.trim()));
        }
        return temp;
    }

    private void validateParticipants(String participants) {
        isDuplicated(participants);
        for (String participant : participants.split(",")) {
            isBlank(participant);
            isLetter(participant);
        }
    }

    public void move() {
        for (Car participant : participants) {
            if (Randoms.pickNumberInRange(0, 9) >= 4) {
                participant.move();
            }
        }
    }

    public void selectWinners() {
        winners = new ArrayList<>(participants);
        Car winningCar = winners.stream()
                .max(Comparator.comparingInt(Car::getPosition))
                .get();
        winners = winners.stream()
                .filter(e -> e.isSamePosition(winningCar.getPosition()))
                .collect(Collectors.toList());

    }

    public int getRounds() {
        return rounds;
    }

    public List<Car> getParticipants() {
        return participants;
    }

    public List<Car> getWinners() {
        return winners;
    }
}
