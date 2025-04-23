package lesson5;

/**
 * ジャンケン戦略インタフェース
 */

public interface Tactics {
	/**
	 * 戦略を読み、ジャンケンの手を得る
	 * グー・チョキ・パーのいずれかをPlayerクラスに定義された
	 * 以下の定数で返す。
	 * Player.STONE
	 * Player.SCISSORS
	 * Player.PAPER
	 * 
	 * @return ジャンケンの手
	 */
	public int readTactics();
}
