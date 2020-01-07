package domain;

public class Car {

    private static final int CAR_NAME_MAX_LENGTH = 5;
    private static final int CAR_MOVE_BASIS_NUMBER = 4;

    private String name;
    private int position;

    public Car(String name) {
        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public void move(int number) {
        if (number >= CAR_MOVE_BASIS_NUMBER) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
