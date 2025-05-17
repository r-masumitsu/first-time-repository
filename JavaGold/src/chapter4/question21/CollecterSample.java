package chapter4.question21;

import java.util.Arrays;
import java.util.List;

//ストリームの文字列を連結する繰り返し処理
public class CollecterSample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		StringBuilder builder = new StringBuilder();
		list.stream().forEach(str -> {
			if (builder.length() != 0) {
				builder.append(",");
			}
			builder.append(str);
		});
		System.out.println(builder);
	}

}
