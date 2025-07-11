package chapter10.question5;

import java.util.Locale;

//ファクトリメソッドを使ってロケールを取得
public class Sample {

	public static void main(String[] args) {
		Locale locale = Locale.forLanguageTag("en-US-x-lvariant-POSIX");
		//国を表示する
		System.out.println(locale.getCountry());
		//言語を表示する
		System.out.println(locale.getLanguage());
	}

}
