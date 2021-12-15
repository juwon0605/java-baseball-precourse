package baseball.model;

import baseball.constant.Rule;

public class State {

	private String state;

	public State(String input) {
		checkInput(input);
		state = input;
	}

	void checkInput(String input) {

	}

	public boolean isFinish() {

		if (state.equals(Rule.STATE_FINISH)) {
			return true;
		}

		return false;
	}
}
