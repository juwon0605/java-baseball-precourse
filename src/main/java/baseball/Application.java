package baseball;

import baseball.controller.BaseballGameController;
import baseball.model.BaseballGame;

public class Application {
	public static void main(String[] args) {

		BaseballGame baseballGame = new BaseballGame();
		BaseballGameController baseballGameController = new BaseballGameController(baseballGame);
		baseballGameController.operate();
	}
}
