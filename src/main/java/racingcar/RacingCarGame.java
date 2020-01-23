package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.view.InputView;

public class RacingCarGame {

    public static void main(String[] args) {
        RacingCarController racingCarController = new RacingCarController(new InputView());
        racingCarController.run();
    }
}
