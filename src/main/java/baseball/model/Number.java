package baseball.model;

public class Number {

	private final String number;

	public Number(String input) {
		checkInput(input);
		number = input;
	}

	private void checkInput(String input) {

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
