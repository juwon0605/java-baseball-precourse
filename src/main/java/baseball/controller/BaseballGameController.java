package baseball.controller;

import baseball.model.BaseballGame;
import baseball.service.BaseballGameService;

public class BaseballGameController {

	private BaseballGame baseballGame;
	private BaseballGameService baseballGameService;

	public BaseballGameController(BaseballGame baseballGame) {
		this.baseballGame = baseballGame;
		baseballGameService = new BaseballGameService();
	}

	public void operate() {
		baseballGameService.playUntilUserFinish(baseballGame);
	}
}
