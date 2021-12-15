package baseball.view;

import baseball.constant.Message;
import baseball.model.Number;
import camp.nextstep.edu.missionutils.Console;

public class NumberView {

	public Number getInput() {
		System.out.print(Message.INPUT_MESSAGE_NUMBER);
		try {
			String input = Console.readLine();
			return new Number(input);
		} catch (IllegalArgumentException e) {
			System.out.println(Message.ERROR + e.getMessage() + "\n");
			return getInput();
		}
	}
}
