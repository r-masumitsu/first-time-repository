package chapter4.question3;

import java.util.Optional;

public class GetTest {

	public static void main(String[] args) {
		//orElseメソッドの使用例
		Optional<String> sample1 = Optional.empty();
		System.out.println(sample1.orElse("empty"));
		
		/*
		 * orElseGetメソッドの使用例
		 * 何らかの処理をしてからその結果を返したい場合に使う
		 * Supplier型を引数に受け取る
		 */
		Optional<String> sample2 = Optional.empty();
		System.out.println(sample2.orElseGet(() -> "else"));
	}

}
