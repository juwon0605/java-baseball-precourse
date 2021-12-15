package baseball.model;

import java.util.HashSet;
import java.util.Set;

import baseball.constant.Rule;
import camp.nextstep.edu.missionutils.Randoms;

public class BaseballGame {

	private Number answer;
	private Score score;
	private State state;

	public BaseballGame() {
		score = new Score();
		state = new State(Option.STATE_RESTART);
	}

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
		//log
		System.out.println(answer);
	}

	public void calculateScore(Number number) {
		score = new Score(answer, number);
	}

	public boolean isCorrect() {
		return score.isCorrect();
	}

	public void initializeScore() {
		score = new Score();
	}

	public boolean isFinish() {
		return state.isFinish();
	}
}
