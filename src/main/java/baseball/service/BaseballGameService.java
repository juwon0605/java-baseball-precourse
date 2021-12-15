package baseball.service;

import baseball.model.BaseballGame;
import baseball.view.FinishView;
import baseball.view.NumberView;
import baseball.view.ScoreView;
import baseball.view.StateView;

public class BaseballGameService {

	public void playUntilUserFinish(BaseballGame baseballGame) {

		while (!baseballGame.isFinish()) {
			baseballGame.initializeScore();
			baseballGame = play(baseballGame);
		}

	}

	private BaseballGame play(BaseballGame baseballGame) {
		baseballGame.makeAnswer();
		NumberView numberView = new NumberView();
		ScoreView scoreView = new ScoreView();
		while (!baseballGame.isCorrect()) {
			baseballGame.calculateScore(numberView.getInput());
			scoreView.print(baseballGame.getScore());
		}
		FinishView finishView = new FinishView();
		finishView.print();
		StateView stateView = new StateView();
		baseballGame.setState(stateView.getInput());
		return baseballGame;
	}
}
