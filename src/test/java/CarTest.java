import java.util.ArrayList;
import java.util.List;

class CarTest {

  static Car getCarFixture() {
    return new Car();
  }

  static List<Car> getCarsFixture(int carNum) {
    List<Car> cars = new ArrayList<>();
    for (int i = 0; i < carNum; i++) {
      cars.add(getCarFixture());
    }
    return cars;
  }
}
