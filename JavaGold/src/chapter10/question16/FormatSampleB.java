package chapter10.question16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//2.パターン文字を使用する方法
public class FormatSampleB {

	public static void main(String[] args) {
		DateTimeFormatter isoFormat = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		System.out.println(isoFormat.format(LocalDate.now()));
	}

}
