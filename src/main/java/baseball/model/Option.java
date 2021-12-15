package baseball.model;

public enum Option {

	STATE_RESTART("1"),
	STATE_FINISH("2");

	private final String value;

	Option(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static String getName(String input) {

		for (Option option : Option.values()) {

			if (option.value.equals(input)) {
				return option.name();
			}

		}

		return null;
	}

	public static boolean contains(String input) {

		for (Option option : Option.values()) {

			if (option.value.equals(input)) {
				return true;
			}

		}

		return false;
	}
}
