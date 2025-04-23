package lesson3;

/**
 * ジャンケンの審判を表すクラス
 */

public class Judge {
	/**
	 * ジャンケンを開始する
	 * @param player1 判定対象プレイヤー１
	 * @param player2 判定対象プレイヤー２
	 */

	public void startJanken(Player player1, Player player2) {
		//ジャンケンの宣言をする
		System.out.println("【ジャンケン開始】");

		//ジャンケンを3回行う
		for (int cnt = 0; cnt < 3; cnt++) {
			//何戦目かを表示する
			System.out.println("【" + (cnt + 1) + "回戦目】");

			//プレイヤーの手を見て、どちらが勝ちかを判定する

			Player winner = judgeJanken(player1, player2);

			if (winner != null) {
				//勝者を表示する
				System.out.println(winner.getName() + "が勝ちました");

				//勝ったプレイヤーへ結果を伝える
				winner.notifyResult(true);
			} else {
				//引き分けの場合
				System.out.println("引き分けです！");
			}
		}
		//ジャンケンの終了を宣言する
		System.out.println("【ジャンケン終了】");

		//最終的な勝者を判定する
		Player finalWinner = judgeFinalWinner(player1, player2);

		//結果の表示
		System.out.print(player1.getWinCount() + " 対 " + player2.getWinCount() + "で");

		if (finalWinner != null) {
			System.out.println(finalWinner.getName() + "の勝ちです");
		} else {
			System.out.println("引き分けです！");
		}
	}

	/**
	 * 「ジャンケン、ポン！」と声をかけ、
	 * プレイヤーの手を見て、どちらかが勝ちかを判定する。
	 * 
	 * @param player1 判定対象プレイヤー
	 * @param player1 判定対象プレイヤー
	 * @return 勝ったプレイヤー。引き分けの場合はnullを返す。
	 */
	private Player judgeJanken(Player player1, Player player2) {
		Player winner = null;

		//プレイヤー１の手を出す
		int player1Hand = player1.showHand();

		//プレイヤー１の手を出す
		int player2Hand = player2.showHand();

		//それぞれの手を表示する
		printHand(player1Hand);
		System.out.print(" vs. ");
		printHand(player2Hand);
		System.out.println();

		//プレイヤー１が勝つ場合
		if ((player1Hand == Player.STONE && player2Hand == Player.SCISSORS)
				|| (player1Hand == Player.SCISSORS && player2Hand == Player.PAPER)
				|| (player1Hand == Player.PAPER && player2Hand == Player.STONE)) {
			winner = player1;
		} else if ((player1Hand == Player.STONE && player2Hand == Player.PAPER)
				|| (player1Hand == Player.SCISSORS && player2Hand == Player.STONE)
				|| (player1Hand == Player.PAPER && player2Hand == Player.SCISSORS)) {
			winner = player2;
		}

		//どちらでもない場合はnullを返す
		return winner;
	}

	/**
	 * 最終的な勝者を判定する。
	 * 
	 * @param player1 判定対象プレイヤー１
	 * @param player2 判定対象プレイヤー２
	 * @return 勝ったプレイヤー。引き分けの場合はnullを返す。
	 */
	private Player judgeFinalWinner(Player player1, Player player2) {
		Player winner = null;

		//Player1から勝ち星を聞く
		int player1WinCount = player1.getWinCount();

		//Player2から勝ち星を聞く
		int player2WinCount = player2.getWinCount();

		if (player1WinCount > player2WinCount) {
			//プレイヤー１の勝ち
			winner = player1;
		} else if (player1WinCount < player2WinCount) {
			//プレイヤー２の勝ち
			winner = player2;
		}
		//どちらでもない場合は引き分け（nullを返す）
		return winner;
	}

	/**
	 * ジャンケンの手を表示する。
	 * 
	 * @param hand ジャンケンの手
	 * 
	 */
	private void printHand(int hand) {
		switch (hand) {
		case Player.STONE:
			System.out.print("グー");
			break;
		case Player.SCISSORS:
			System.out.print("チョキ");
			break;
		case Player.PAPER:
			System.out.print("パー");
			break;
		default:
			break;
		}
	}
}
