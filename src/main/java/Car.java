import java.util.Objects;

public class Car {
    private String name;
    private int progress = 0;

    public Car() {}

    public Car(String name) {
        this.name = name;
    }

    public void forward() {
        progress++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", progress=" + progress +
                '}';
    }
}
