package chapter10.question1;

import java.util.Locale;

//getDefaultメソッドを使ってロケールを取得
public class Sample {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		//国を表示する
		System.out.println(locale.getCountry());
		//言語を表示する
		System.out.println(locale.getLanguage());
	}

}
