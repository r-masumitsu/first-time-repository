package lesson2;

public class SimpleJanken {
	//ジャンケンの手を表す定数
	public static final int STONE = 0; //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2; //パー

	public static void main(String[] args) {
		//乱数を格納するための変数
		double randomNum = 0;
		//プレイヤー１が出した手を格納する変数
		int player1Hand = 0;
		//プレイヤー２が出した手を格納する変数
		int player2Hand = 0;
		//プレイヤー１の勝ち数
		int player1WinCount = 0;
		//プレイヤー２の勝ち数
		int player2WinCount = 0;
		System.out.println("【ジャンケン開始】");
		//ジャンケンを3回実施する
		for (int cnt = 0; cnt < 3; cnt++) {
			//プレイヤー１が何を出すか決める
			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				//randomが0.0以上1.0未満の場合、グー
				player1Hand = STONE;
				//プレイヤー１の手を表示する
				System.out.println("グー");
			} else if (randomNum < 2) {
				//randomが1.0以上2.0未満の場合、チョキ
				player1Hand = SCISSORS;
				//プレイヤー１の手を表示する
				System.out.println("チョキ");
			} else if (randomNum < 3) {
				//randomが2.0以上3.0未満の場合、パー
				player1Hand = PAPER;
				//プレイヤー１の手を表示する
				System.out.println("パー");
			}

			//プレイヤー２が何を出すか決める
			randomNum = Math.random() * 3;
			if (randomNum < 1) {
				//randomが0.0以上1.0未満の場合、グー
				player2Hand = STONE;
				//プレイヤー２の手を表示する
				System.out.println("グー");
			} else if (randomNum < 2) {
				//randomが1.0以上2.0未満の場合、チョキ
				player2Hand = SCISSORS;
				//プレイヤー２の手を表示する
				System.out.println("チョキ");
			} else if (randomNum < 3) {
				//randomが2.0以上3.0未満の場合、パー
				player2Hand = PAPER;
				//プレイヤー２の手を表示する
				System.out.println("パー");
			}

			//どちらが勝つかを判定し、結果を表示する
			if ((player1Hand == STONE && player2Hand == SCISSORS) //プレイヤー１が勝つ場合
					|| (player1Hand == SCISSORS && player2Hand == PAPER)
					|| (player1Hand == PAPER && player2Hand == STONE)) {
				//プレイヤー１の勝った回数を加算する
				player1WinCount++;
				//ジャンケンの結果を表示する
				System.out.println("プレイヤー１が勝ちました！");
			} else if ((player1Hand == STONE && player2Hand == PAPER) //プレイヤー２が勝つ場合
					|| (player1Hand == SCISSORS && player2Hand == STONE)
					|| (player1Hand == PAPER && player2Hand == SCISSORS)) {
				//プレイヤー２の勝った回数を加算する
				player2WinCount++;
				//ジャンケンの結果を表示する
				System.out.println("プレイヤー２が勝ちました！");
			} else { //引き分けの場合
				//ジャンケンの結果を表示する
				System.out.println("引き分けです！");
			}
		}
		System.out.println("ジャンケン終了");
		
		if(player1WinCount > player2WinCount) {	//プレイヤー１の勝ち数が多いとき
			System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー１の勝ちです！");
		}else if(player1WinCount < player2WinCount) {	//プレイヤー２の勝ち数が多いとき
			System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー２の勝ちです！");
		}else {
			System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです！");
		}
	}

}
