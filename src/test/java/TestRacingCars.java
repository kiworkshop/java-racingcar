import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRacingCars {

    RacingCars racingCars = new RacingCars();

    @Test
    public void 레이싱카_추가_테스트(){
        assertTrue(racingCars.isEmpty());
        racingCars.add(new RacingCar("harris"));
        assertEquals(racingCars.getRacingCars().get(0).getName(),"harris");
    }
}
