package baseball.constant;

import baseball.model.Option;

public class Message {

	public static final String BALL = "볼";
	public static final String STRIKE = "스트라이크";
	public static final String NOTING = "낫싱";

	public static final String EMPTY = "";
	public static final String SPACE = " ";
	public static final String TAP = "	";

	public static final String INPUT_MESSAGE_NUMBER = "숫자를 입력해주세요 : ";
	public static final String INPUT_MESSAGE_STATE =
		"게임을 새로 시작하려면 " + Option.STATE_RESTART.getValue() + ", 종료하려면 " + Option.STATE_FINISH.getValue() + "를 입력하세요.";

	public static final String OUTPUT_MESSAGE_FINISH = Rule.NUMBER_LENGTH + "개의 숫자를 모두 맞히셨습니다! 게임 종료";

	public static final String ERROR = "[ERROR]";
	public static final String ERROR_MESSAGE_NOT_POSITIVE_NUMBER = "양의 정수를 입력해 주세요.";
	public static final String ERROR_MESSAGE_EXCEED_INTEGER = Integer.MAX_VALUE + "이하를 입력해 주세요.";
	public static final String ERROR_MESSAGE_NOT_CORRECT_LENGTH = "자를 입력해주세요.";
	public static final String ERROR_MESSAGE_NOT_EXIST_OPTION = "없는 옵션입니다.";

}
