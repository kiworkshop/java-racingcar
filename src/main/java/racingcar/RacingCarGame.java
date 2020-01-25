package racingcar;

import racingcar.controller.RacingCarController;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarGame {

    public static void main(String[] args) {
        RacingCarController racingCarController = new RacingCarController(new InputView(), new OutputView());
        racingCarController.run();
    }
}
