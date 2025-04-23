package lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 標準出力によりジャンケンの手をユーザに聞く戦略クラス
 */
public class AskTactics implements Tactics {

	@Override
	public int readTactics() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ジャンケンの手を入力してください。");
		System.out.println("0: グー");
		System.out.println("1: チョキ");
		System.out.println("2: パー");
		System.out.println("→ ");
		
		//ジャンケンの手
		int hand = 0;
		
		while(true) {
			try {
				//入力文字列を受け取る
				String inputStr = bReader.readLine(); 
				//入力文字列を数値に変換する
				hand = Integer.parseInt(inputStr);
				//0~2のいずれかが入力されたらループを抜ける
				if(hand == Player.STONE
					|| hand == Player.SCISSORS
					|| hand == Player.PAPER) {
					break;
				}else {
					System.out.println("入力が正しくありません。再度入力してください。");
					System.out.println("→ ");
				}
			}catch (Exception e) {
				System.out.println("入力が正しくありません。再度入力してください。");
				System.out.println("→ ");
			}
		}
		return hand;
	}

}
