package racingcar.controller;

import racingcar.domain.RacingCarGameResult;
import racingcar.domain.car.RacingCars;
import racingcar.domain.gameround.GameRound;
import racingcar.domain.proceedingstrategy.RandomProceedingStrategy;
import racingcar.service.RacingCarService;
import racingcar.view.InputView;

public class RacingCarController {
    private final InputView inputView;
    private final RacingCarService racingCarService = new RacingCarService();

    public RacingCarController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run(){
        String carNames = inputView.getRacingCarNames();
        RacingCars racingCars = racingCarService.produceCarsWith(carNames);

        int gameRound = inputView.getRacingCarGameRound();

        RacingCarGameResult result = racingCarService.race(racingCars, gameRound, new RandomProceedingStrategy());

    }
}
