package domain;

public class Trial {

    private static final int MINIMUM_TRIAL = 1;

    private int trial;

    public Trial(String numberString) {
        int number = convertToInt(numberString);
        if (number < MINIMUM_TRIAL) {
            throw new IllegalArgumentException();
        }
        this.trial = number;
    }

    private int convertToInt(String numberString) {
        try {
            return Integer.parseInt(numberString);
        } catch (NumberFormatException ne) {
            throw new IllegalArgumentException();
        }
    }

    public int getTrial() {
        return trial;
    }
}
