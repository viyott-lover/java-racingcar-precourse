package racingcar.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ParticipantTest {

    @ParameterizedTest
    @ValueSource(strings = {"pobi,javajigi,me",
            "pobi,pobi,poni"})
    void participantsTest(String input) {
        System.out.println(input);
        assertThatThrownBy(() -> new Participant(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}