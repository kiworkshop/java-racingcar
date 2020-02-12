package domain.result;

import domain.car.Car;
import util.StringUtils;

public class CarSnapShot {

    private static final String CAR_POSITION_EXPRESSION = "-";
    private static final String FORMATTED_CARSNAPSHOT = "%-5s : %s";

    private String name;
    private int position;

    public static CarSnapShot from(Car car) {
        return new CarSnapShot(car.getName(), car.getPosition());
    }

    private CarSnapShot(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
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
