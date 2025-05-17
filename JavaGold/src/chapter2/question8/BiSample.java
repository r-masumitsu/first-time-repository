package chapter2.question8;

import java.util.function.BiPredicate;

public class BiSample {

	public static void main(String[] args) {
		BiPredicate<String, String> b = (str, suffix) -> str.endsWith(suffix);
		System.out.println(b.test("sample.class", "class"));
	}

}
