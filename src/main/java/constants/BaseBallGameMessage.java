package constants;

import static constants.BaseballGameSetting.*;

public class BaseBallGameMessage {
	public static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
	public static final String END_MESSAGE = ANSWER_LENGTH + "개의 숫자를 모두 맞히셨습니다! 게임 종료";
	public static final String RESTART_MESSAGE =
		"게임을 새로 시작하려면 " + RESTART_OPTION + ", 종료하려면 " + FINISH_OPTION + "를 입력하세요.";
	public static final String BALL = "볼";
	public static final String STRIKE = "스트라이크";
	public static final String NOTHING = "낫싱";
}
