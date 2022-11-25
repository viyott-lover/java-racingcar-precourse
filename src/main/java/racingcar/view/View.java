package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class View {
    private static final String INPUT_PARTICIPANTS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUNDS = "시도할 회수는 몇회인가요?";

    public String inputParticipants() {
        System.out.println(INPUT_PARTICIPANTS);
        String participants = Console.readLine();
        return participants.trim();
    }

    public String inputRounds() {
        System.out.println(INPUT_ROUNDS);
        String rounds = Console.readLine();
        return rounds.trim();
    }
}
