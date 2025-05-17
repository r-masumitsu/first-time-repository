package chapter4.question27;

import java.util.Arrays;
import java.util.List;

public class PeekSample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream()
			.map(x -> x * 3)
			.peek(x -> {
				System.out.println("debug:" + x);
			})
			.filter(x -> x % 2 == 0)
			.forEach(x -> {
				System.out.println("value:" + x);
			});
	}

}
