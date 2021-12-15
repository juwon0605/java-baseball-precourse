package baseball.model;

public class State {

	private int state;

	public State(String input) {
		checkInput(input);
		state = Integer.valueOf(input);
	}

	void checkInput(String input) {

	}
}
