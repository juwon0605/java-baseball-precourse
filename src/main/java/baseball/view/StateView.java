package baseball.view;

import baseball.constant.Message;
import baseball.model.State;
import camp.nextstep.edu.missionutils.Console;

public class StateView {

	public State getInput() {
		System.out.println(Message.INPUT_MESSAGE_STATE);
		try {
			String input = Console.readLine();
			return new State(input);
		} catch (IllegalArgumentException e) {
			System.out.println(Message.ERROR + e.getMessage() + "\n");
			return getInput();
		}
	}
}
