package baseball.model;

import baseball.constant.Message;

public class State {

	private String state;

	public State(Option option) {
		state = option.name();
	}

	public State(String input) {
		checkInput(input);
		state = Option.getName(input);
	}

	void checkInput(String input) {

		if (!Option.contains(input)) {
			throw new IllegalArgumentException(Message.ERROR_MESSAGE_NOT_EXIST_OPTION);
		}

	}

	public boolean isFinish() {

		if (state.equals(Option.STATE_FINISH.name())) {
			return true;
		}

		return false;
	}
}
