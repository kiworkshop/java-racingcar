package domain;

public class Trial {

    private static final int MINIMUM_TRIAL = 1;

    private int trial;

    public Trial(int number) {
        if (number < MINIMUM_TRIAL) {
            throw new IllegalArgumentException();
        }
        this.trial = number;
    }

    public int getTrial() {
        return trial;
    }
}
