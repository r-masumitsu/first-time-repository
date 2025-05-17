package chapter4.question17;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,4,3,2,1);
		list.stream()
			.sorted((a, b) -> {
				if(a < b) return -1;
				if(b < a) return 1;
				return 0;
			})
			.forEach(System.out::println);
	}

}
