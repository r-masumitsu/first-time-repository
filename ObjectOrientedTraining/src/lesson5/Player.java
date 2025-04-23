package lesson5;

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
	
	/** 与えられた戦略 */
	private Tactics tactics;
	
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
		//与えられた戦略を読んでジャンケンの手を決める
		int hand = tactics.readTactics();
		
		//決定した手を戻り値として返す
		return hand;
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
	
	/**
	 * プレイヤーに戦略を渡す。
	 * 
	 * @param tactics 戦略
	 */
	void setTactics(Tactics tactics) {
		this.tactics = tactics;
	}
}
