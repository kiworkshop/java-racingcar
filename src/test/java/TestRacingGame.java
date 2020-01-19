import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TestRacingGame {

    @Test
    public void 생성자테스트(){
        int racingNum = -1;

        assertThatThrownBy(() -> new RacingGame(racingNum)).isInstanceOf(IllegalArgumentException.class);

    }
}
