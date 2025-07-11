package chapter10.question2;

import java.util.Locale;

//コンストラクタを使ってロケールを取得
public class Sample {

	public static void main(String[] args) {
		//ロケールのコンストラクタはバージョン19から廃止
		//Locale locale = new Locale("es", "ES", "Traditional_WIN");
		Locale locale = Locale.getDefault();
		//国を表示する
		System.out.println(locale.getCountry());
		//言語を表示する
		System.out.println(locale.getLanguage());
	}

}
