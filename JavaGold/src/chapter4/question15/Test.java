package chapter4.question15;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Value> list = Arrays.asList(
			new Value("A"),
			new Value("B"),
			new Value("C"),
			new Value("A")
		);
		long size = list.stream().distinct().count();
		System.out.println(size);
	}

}
