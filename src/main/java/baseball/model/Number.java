package baseball.model;

public class Number {

	private final int number;

	public Number(String input) {
		checkInput(input);
		number = Integer.valueOf(input);
	}

	private void checkInput(String input) {

	}
}
