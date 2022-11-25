package racingcar.validate;

public class Validate {

    private static final String BLANK_EXCEPTION = "[ERROR] 입력된 내용이 없습니다. 다시 입력하세요.";

    public static void isBlank(String input) {
        if(input.length() == 0) {
            throw new IllegalArgumentException(BLANK_EXCEPTION);
        }
    }

    public static void isNumber(String input) {
        if(input.matches("[0-9]+")) {
            throw new IllegalArgumentException(BLANK_EXCEPTION);
        }
    }

    public static void isLetter(String input) {
        if(input.matches("[a-zA-Z,]+")) {
            throw new IllegalArgumentException(BLANK_EXCEPTION);
        }
    }
}
