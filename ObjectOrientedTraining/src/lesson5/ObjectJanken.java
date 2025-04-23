package lesson5;

/**
 * オブジェクト指向によるジャンケンプログラム。
 */

public class ObjectJanken {

	public static void main(String[] args) {
		//審判（斉藤さん）のインスタンス生成
		Judge saito = new Judge();

		//プレイヤー１（村田さん）生成
		Player murata = new Player("村田さん");
		//村田さんに渡す戦略クラスを生成する
		Tactics murataTactics = new AskTactics();
		//村田さんに戦略クラスを渡す
		murata.setTactics(murataTactics);

		//プレイヤー２（山田さん）生成
		Player yamada = new Player("山田さん");
		//山田さんに渡す戦略クラスを生成する
		Tactics yamadaTactics = new RamdomTactics();
		//山田さんに戦略クラスを渡す
		yamada.setTactics(yamadaTactics);

		//村田さんと山田さんをプレイヤーとしてジャンケンを開始する
		saito.startJanken(murata, yamada);
	}

}
