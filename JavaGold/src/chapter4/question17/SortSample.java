package chapter4.question17;

import java.util.Arrays;
import java.util.List;

public class SortSample {

	public static void main(String[] args) {
		List<Item> list = Arrays.asList(
				new Item("A"),
				new Item("C"),
				new Item("B"));
		
		list.stream()
		.sorted((a,b) -> a.getName().compareTo(b.getName()))	//オーバーロードされたsortedメソッド
		.forEach(System.out::println);
	}

}
