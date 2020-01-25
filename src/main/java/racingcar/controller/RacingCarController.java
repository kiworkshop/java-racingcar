package racingcar.controller;

import racingcar.domain.RacingCarGameResult;
import racingcar.domain.car.RacingCars;
import racingcar.domain.proceedingstrategy.RandomProceedingStrategy;
import racingcar.service.RacingCarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RacingCarService racingCarService = new RacingCarService();

    public RacingCarController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run(){
        String carNames = inputView.getRacingCarNames();
        RacingCars racingCars = racingCarService.produceCarsWith(carNames);

        int gameRound = inputView.getRacingCarGameRound();

        RacingCarGameResult result = racingCarService.race(racingCars, gameRound, new RandomProceedingStrategy());
        outputView.printGameResult(result);

        outputView.printWinners(result);
    }
}
