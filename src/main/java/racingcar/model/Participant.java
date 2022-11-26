package racingcar.model;

import racingcar.validate.Validate;

import java.util.ArrayList;
import java.util.List;

import static racingcar.validate.Validate.*;

public class Participant {
    private List<Car> participants;

    public Participant(String participants) {
        this.participants = splitParticipants(participants);
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
            isFiveCharsOrLess(participant);
        }
    }

    public List<Car> getParticipants() {
        return participants;
    }
}
