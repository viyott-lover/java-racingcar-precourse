package racingcar.validate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Validate {

    private static final String BLANK_EXCEPTION = "[ERROR] 입력된 내용이 없습니다.";
    private static final String NUMBER_EXCEPTION = "[ERROR] 입력이 숫자가 아닙니다.";
    private static final String LETTER_EXCEPTION = "[ERROR] 입력이 문자가 아닙니다.";
    private static final String DUPLICATE_EXCEPTION = "[ERROR] 중복되지 않게 입력하세요";

    public static void isBlank(String input) {
        if (input.length() == 0) {
            throw new IllegalArgumentException(BLANK_EXCEPTION);
        }
    }

    public static void isNumber(String input) {
        if (input.matches("[^0-9]+")) {
            throw new IllegalArgumentException(NUMBER_EXCEPTION);
        }
    }

    public static void isLetter(String input) {
        if (input.matches("[^a-zA-Z]+")) {
            throw new IllegalArgumentException(LETTER_EXCEPTION);
        }
    }

    public static void isDuplicated(String input) {
        String[] splitedInput = input.split(",");
        List<String> deDuplicate = Arrays.stream(splitedInput)
                .distinct()
                .collect(Collectors.toList());
        if (deDuplicate.size() != splitedInput.length) {
            throw new IllegalArgumentException(DUPLICATE_EXCEPTION);
        }

    }
}
