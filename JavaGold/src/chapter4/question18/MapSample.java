package chapter4.question18;

import java.util.Arrays;

public class MapSample {

	public static void main(String[] args) {
		String[] fruits = {"apple", "orange", "banana"};
		Arrays.stream(fruits)
		.map(f -> f.length())
		.forEach(System.out::println);
	}

}
