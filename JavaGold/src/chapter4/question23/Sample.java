package chapter4.question23;

import java.util.List;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		List<Integer> result =
				list.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
