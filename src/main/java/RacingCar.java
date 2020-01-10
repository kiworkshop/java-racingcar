public class RacingCar {
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
}
