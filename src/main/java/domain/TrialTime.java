package domain;

public class TrialTime {

    private int trialTime;

    public TrialTime(int trialTime) {
        if (trialTime < 0) {
            throw new IllegalArgumentException();
        }
        this.trialTime = trialTime;
    }

    public int getTrialTime() {
        return trialTime;
    }
}
