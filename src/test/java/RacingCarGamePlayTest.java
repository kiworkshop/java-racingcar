import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarGamePlayTest {

    @Test
    void testGetWinner() {
        String[] targetCarNames = {"a", "b", "c"};
        RacingCarGamePlay racingCarGamePlay = new RacingCarGamePlay(targetCarNames, 0);
        racingCarGamePlay.makeCars(targetCarNames);
        ArrayList<String> winnerList = new ArrayList<>();
        winnerList.add("a");
        winnerList.add("b");
        winnerList.add("c");
        winnerList.equals(racingCarGamePlay.getWinner(racingCarGamePlay.makeCars(targetCarNames)));

    }
}