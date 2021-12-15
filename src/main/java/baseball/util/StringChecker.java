package baseball.util;

import baseball.constant.Message;

public class StringChecker {

	public void isCorrectLength(String input, int correctLength) {

		if (input.length() != correctLength) {
			throw new IllegalArgumentException(correctLength + Message.ERROR_MESSAGE_NOT_CORRECT_LENGTH);
		}

	}
}
