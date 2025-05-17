package chapter4.question27;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("banana", "apple", "orange");
		Stream<String> straem = list.stream();
		straem.filter(str -> str.length() > 5)
			.peek(str -> System.out.print(str + " "))
			.map(str -> str.toUpperCase())
			.peek(str -> System.out.print(str + " "))
			.forEach(System.out::print);
			
	}

}
