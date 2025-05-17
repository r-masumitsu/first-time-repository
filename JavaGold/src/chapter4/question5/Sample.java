package chapter4.question5;

import java.util.Optional;

public class Sample {

	public static void main(String[] args) {
		//Optionalが値を持っている例
		Optional<String> sample1 = Optional.of("test");
		sample1.ifPresent((str) -> System.out.println(str));
		
		/*
		 * Optionalが値を持っていない例
		 * Optionalは空なのでラムダ式が実行されることはない
		 * getメソッドのように例外が発生することもない
		 */
		Optional<String> sample2 = Optional.empty();
		sample2.ifPresent((str) -> System.out.println(str));
	}

}
