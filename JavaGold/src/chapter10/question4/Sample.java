package chapter10.question4;

import java.util.Locale;

//ビルダーを使ってロケールを取得
public class Sample {

	public static void main(String[] args) {
		Locale locale = new Locale.Builder()
				.setLanguage("ja")
				.setRegion("JP")
				.setScript("Jpan")
				.build();
		//国を表示する
		System.out.println(locale.getCountry());
		//言語を表示する
		System.out.println(locale.getLanguage());
	}

}
