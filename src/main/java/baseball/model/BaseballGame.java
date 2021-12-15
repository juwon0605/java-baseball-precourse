package baseball.model;

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

	}

	public void calculateScore(Number number) {

	}

	public boolean isFinish() {
		return true;
	}
}
