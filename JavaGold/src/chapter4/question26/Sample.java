package chapter4.question26;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("banana", "apple", "orange");
		Stream<String> stream = list.stream();
		Set<Boolean> keys = stream.collect(
			Collectors.partitioningBy(str -> str.length() > 5)
		).keySet();
		keys.forEach(System.out::println);
	}

}
