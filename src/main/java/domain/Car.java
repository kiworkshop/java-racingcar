package domain;

public class Car {

    private int position;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void goOrStop() {
        int randomNumber = (int) (Math.random() * 10);
        if (randomNumber > 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name);
        for (int i = 0; i < position; i++) {
            result.append("-");
        }
        return result.toString();
    }
}
