package chapter4.question20;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinSample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(98,99,96,97,95);
		Optional<Integer> result = list.stream().min((a, b) -> {
			if(a == b) return 0;
			if(a < b) return -1;
			return 1;
		});
		result.ifPresent(System.out::println);
	}

}
