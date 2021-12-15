package baseball.model;

import baseball.constant.Rule;

public class Score {

	private int strike;
	private int ball;

	public Score(Number answer, Number input) {
		strike = calculateStrike(answer, input);
		ball = calculateBall(answer, input);
	}

	private int calculateStrike(Number answer, Number input) {
		int strike = 0;

		for (int i = 0; i < answer.length(); i++) {

			if (answer.charAt(i) == input.charAt(i)) {
				strike++;
			}

		}

		return strike;
	}

	private int calculateBall(Number answer, Number input) {
		int ball = 0;

		for (int i = 0; i < answer.length(); i++) {

			if (answer.charAt(i) != input.charAt(i) && answer.contains(input.charAt(i))) {
				ball++;
			}

		}

		return ball;
	}

	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}

	public boolean isCorrect() {
		return strike == Rule.NUMBER_LENGTH;
	}
}
