package baseball.service;

import baseball.model.BaseballGame;
import baseball.view.NumberView;
import baseball.view.ScoreView;
import baseball.view.StateView;

public class BaseballGameService {

	public void playUntilUserFinish(BaseballGame baseballGame) {

		while (!baseballGame.isFinish()) {
			baseballGame = play(baseballGame);
		}

	}

	private BaseballGame play(BaseballGame baseballGame) {
		baseballGame.makeAnswer();

		NumberView numberView = new NumberView();
		baseballGame.calculateScore(numberView.getInput());

		ScoreView scoreView = new ScoreView();
		scoreView.print(baseballGame.getScore());

		StateView stateView = new StateView();
		baseballGame.setState(stateView.getInput());

		return baseballGame;
	}
}
