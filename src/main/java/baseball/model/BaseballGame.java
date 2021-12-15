package baseball.model;

import java.util.HashSet;
import java.util.Set;

import baseball.constant.Rule;
import camp.nextstep.edu.missionutils.Randoms;

public class BaseballGame {

	private Number answer;
	private Score score;
	private State state;

	public Score getScore() {
		return score;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void makeAnswer() {
		StringBuilder answer = new StringBuilder();
		Set<Integer> checkDuplication = new HashSet<>();

		while (answer.length() < Rule.NUMBER_LENGTH) {
			int randomNumber = Randoms.pickNumberInRange(Rule.START_NUMBER_OF_RANGE, Rule.END_NUMBER_OF_RANGE);

			if (!checkDuplication.contains(randomNumber)) {
				answer.append(randomNumber);
				checkDuplication.add(randomNumber);
			}

		}

		this.answer = new Number(answer.toString());
	}

	public void calculateScore(Number number) {

	}

	public boolean isFinish() {
		return true;
	}
}
