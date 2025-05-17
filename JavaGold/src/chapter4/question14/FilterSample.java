package chapter4.question14;

import java.util.Arrays;
import java.util.List;

public class FilterSample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream()
			.filter(x -> x > 5)	//5より大きい数に絞り込み
			.filter(x -> x % 2 == 0)	//偶数に絞り込み
			.forEach(System.out::println);
	}

}
