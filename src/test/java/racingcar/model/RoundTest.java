package racingcar.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class RoundTest {

    @ParameterizedTest
    @CsvSource({"a", "a1", "1a", "-", ".", "10000000000"})
    void roundTest(String input) {
        assertThatThrownBy(() -> new Round(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}