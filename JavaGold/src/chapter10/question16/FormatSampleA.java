package chapter10.question16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//1.事前に定義された定数を使用する方法
public class FormatSampleA {

	public static void main(String[] args) {
		DateTimeFormatter isoFormat = DateTimeFormatter.ISO_DATE;
		System.out.println(isoFormat.format(LocalDate.now()));
	}

}
