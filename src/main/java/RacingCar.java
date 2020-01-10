import java.util.Random;

public class RacingCar {
    private static Random rand = new Random();

    private String name;
    private int distance;

    public RacingCar(String name) {
        this.name = name;
        this.distance = 0;
    }

    public int moveOneStep() {
        if (rand.nextInt(10) >= 4) {
            distance++;
        }
        return distance;
    }

    public RacingCarSnapshot moveOneStep2() {
        if (rand.nextInt(10) >= 4) {
            distance++;
        }
        return new RacingCarSnapshot(name, distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
