package domain.result;

import util.StringUtils;

public class CarSnapShot {

    private static final String CAR_POSITION_EXPRESSION = "-";
    private static final String FORMATTED_CARSNAPSHOT = "%-5s : %s";

    private String name;
    private int position;

    static CarSnapShot from(String name, int position) {
        return new CarSnapShot(name, position);
    }

    private CarSnapShot(String name, int position) {
        this.name = name;
        this.position = position;
    }

    String getName() {
        return name;
    }

    int getPosition() {
        return position;
    }

    boolean inSamePositionWith(int position) {
        return this.position == position;
    }

    @Override
    public String toString() {
        return String.format(FORMATTED_CARSNAPSHOT, name, getPositionString());
    }

    private String getPositionString() {
        return StringUtils.multiply(CAR_POSITION_EXPRESSION, position);
    }

}
