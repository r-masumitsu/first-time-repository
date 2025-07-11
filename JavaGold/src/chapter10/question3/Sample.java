package chapter10.question3;

import java.util.Locale;

//ロケール定数を使ってロケールを取得
public class Sample {

	public static void main(String[] args) {
		//アメリカのロケール情報を構築
		Locale locale = Locale.US;
		//国を表示する
		System.out.println(locale.getCountry());
		//言語を表示する
		System.out.println(locale.getLanguage());
	}

}
