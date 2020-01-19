public class RacingCar {
    public static final int ONE_STEP = 1;
    private String name;
    private int distance;

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public RacingCar(String name) {
        this.name = name;
        this.distance = 0;
    }

    public void move() {
        distance += ONE_STEP;
    }
}
