package chapter4.question11;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		String[] strArray = { "A", "B", "C" };
		Stream<String> streamA = Arrays.stream(strArray);
		streamA.forEach(System.out::println);

		int[] intArray = { 1, 2, 3, 4, 5 };
		//StreamとIntStreamは互換性がないためコンパイルエラーになる
		//Stream<String> stream = Arrays.stream(intArray);
		IntStream streamB = Arrays.stream(intArray);
		streamB.forEach(System.out::println);
	}

}
