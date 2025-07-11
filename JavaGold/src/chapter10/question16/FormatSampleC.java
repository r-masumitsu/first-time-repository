package chapter10.question16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

//3.ローカライズされたスタイルを使用する
public class FormatSampleC {

	public static void main(String[] args) {
		
		// 日本の表示
		Locale.setDefault(Locale.JAPAN);
		DateTimeFormatter a = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter b = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter c = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter d = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		LocalDate date = LocalDate.now();
		System.out.println(a.format(date));
		System.out.println(b.format(date));
		System.out.println(c.format(date));
		System.out.println(d.format(date));
		
		// アメリカの表示
		Locale.setDefault(Locale.US);
		a = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		b = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		c = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		d = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		date = LocalDate.now();
		System.out.println(a.format(date));
		System.out.println(b.format(date));
		System.out.println(c.format(date));
		System.out.println(d.format(date));
	}

}
