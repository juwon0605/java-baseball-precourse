package baseball.model;

import baseball.constant.Rule;
import baseball.util.NumberChecker;
import baseball.util.StringChecker;

public class Number {

	private final String number;

	public Number(String input) {
		checkInput(input);
		number = input;
	}

	private void checkInput(String input) {
		NumberChecker numberChecker = new NumberChecker();
		numberChecker.isPositiveInteger(input);

		StringChecker stringChecker = new StringChecker();
		stringChecker.isCorrectLength(input, Rule.NUMBER_LENGTH);
	}

	public int length() {
		return number.length();
	}

	public char charAt(int idx) {
		return number.charAt(idx);
	}

	public boolean contains(char input) {
		return number.contains(String.valueOf(input));
	}

}
