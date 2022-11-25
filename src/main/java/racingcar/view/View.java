package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;

import java.util.List;
import java.util.StringJoiner;

public class View {
    private static final String INPUT_PARTICIPANTS = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_ROUNDS = "시도할 회수는 몇회인가요?";
    private static final String RESULT = "실행 결과";
    private static final String WINNERS = "최종 우승자 : ";

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

    public void printResult(List<Car> participants) {
        System.out.println(RESULT);
        for (Car participant : participants) {
            System.out.println(participant.getName() + " : " + calculateMileage(participant));
        }
        System.out.println();
    }

    private String calculateMileage(Car participant) {
        StringBuilder mileage = new StringBuilder();
        for (int i = 0; i < participant.getPosition(); i++) {
            mileage.append("-");
        }
        return mileage.toString();
    }

    public void printWinners(List<Car> winners) {
        StringJoiner joiner = new StringJoiner(", ");
        for (Car winner : winners) {
            joiner.add(winner.getName());
        }
        System.out.println(WINNERS + joiner.toString());
    }
}
