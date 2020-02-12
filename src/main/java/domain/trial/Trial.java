package domain.trial;

import exception.InvalidInputException;

public class Trial {

    private static final String NEGATIVE_TRIAL_EXCEPTION = "시도 횟수는 음수가 될 수 없습니다.";
    private static final int MINIMUM_TRIAL = 1;

    private int trial;

    public static Trial from(int number) {
        return new Trial(number);
    }

    private Trial(int number) {
        if (number < MINIMUM_TRIAL) {
            throw InvalidInputException.from(NEGATIVE_TRIAL_EXCEPTION);
        }
        this.trial = number;
    }

    public int getTrial() {
        return trial;
    }
}
