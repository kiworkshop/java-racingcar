import java.util.ArrayList;
import java.util.List;

public class RacingCars {


    private List<RacingCar> racingCars = new ArrayList();

    public List<RacingCar> getRacingCars() {
        return racingCars;
    }

    public boolean isEmpty(){
        return racingCars.isEmpty();
    }

    public void add(RacingCar racingCar){
        racingCars.add(racingCar);
    }

}
