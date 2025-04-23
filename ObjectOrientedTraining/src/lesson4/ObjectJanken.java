package lesson4;

import lesson3.Judge;
import lesson3.Player;

/**
 * オブジェクト指向によるジャンケンプログラム。
 */

public class ObjectJanken {

	public static void main(String[] args) {
		//審判（斉藤さん）のインスタンス生成
		Judge saito = new Judge();

		//プレイヤー１（村田さん）生成
		Player murata = new Murata("村田さん");

		//プレイヤー２（山田さん）生成
		Player yamada = new Yamada("山田さん");

		//村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, yamada);
	}

}
