package lesson3;

public class Player {
	//ジャンケンの手を表す定数
	public static final int STONE = 0; //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2; //パー

	//フィールド
	//プレイヤーの名前
	private String name;
	//プレイヤーの勝った回数
	private int winCount = 0;
	
	//コンストラクタ
	/**
	 * プレイヤークラスのコンストラクタ。
	 * 
	 * @param name 名前
	 */
	public Player(String name) {
		this.name = name;
	}
	
	//メソッド
	/**
	 * ジャンケンの手を出す。
	 * @return ジャンケンの手
	 */
	public int showHand() {
		//プレイヤーが何を出すか決める
		double randomNum = Math.random() * 3;
		if (randomNum < 1) {
			//randomが0.0以上1.0未満の場合、グー
			return STONE;
		} else if (randomNum < 2) {
			//randomが1.0以上2.0未満の場合、チョキ
			return SCISSORS;
		} else {
			//randomが2.0以上3.0未満の場合、パー
			return PAPER;
		}
	}

	/**
	 * 審判から勝敗を聞く。
	 * @param result true:勝ち, false:負け
	 */
	public void notifyResult(boolean result) {
		if (result) {
			winCount++;
		}
	}

	/**
	 * 自分の勝った回数を答える。
	 *@return 勝った回数
	 */
	public int getWinCount() {
		return winCount;
	}

	/**
	 * 自分の名前を答える。
	 * 
	 * @return 名前
	 */
	public String getName() {
		return name;
	}
}
