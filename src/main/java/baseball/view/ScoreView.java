package baseball.view;

import java.util.ArrayList;
import java.util.List;

import baseball.constant.Message;
import baseball.model.Score;

public class ScoreView {

	public void print(Score score) {
		List<String> result = new ArrayList<>();

		if (score.getBall() > 0) {
			result.add(score.getBall() + Message.BALL);
		}

		if (score.getStrike() > 0) {
			result.add(score.getStrike() + Message.STRIKE);
		}

		if (score.getBall() == 0 && score.getStrike() == 0) {
			result.add(Message.NOTING);
		}

		System.out.println(String.join(" ", result));
	}

}
