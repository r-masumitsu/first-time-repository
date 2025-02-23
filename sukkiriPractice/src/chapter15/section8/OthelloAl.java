package chapter15.section8;

public interface OthelloAl {
	/**
	 * 現在の盤の状態から、次に打つ場所を決める処理
	 * @param board 現在の盤状態（8×8のint配列）
	 * @return  次に石を打つべきx座標とy座標を格納した要素数2の配列
	 */
	public int[] decide(int[][] board);
}
