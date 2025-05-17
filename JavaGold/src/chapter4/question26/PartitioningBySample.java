package chapter4.question26;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chapter4.question23.Item;
import chapter4.question23.ItemType;

public class PartitioningBySample {

	public static void main(String[] args) {
		List<Item> list = Arrays.asList(
				new Item(1, ItemType.BOOK, "Java", 1980),
				new Item(2, ItemType.BOOK, "Lambda", 2980),
				new Item(3, ItemType.MAGAZINE, "Software", 980),
				new Item(4, ItemType.MAGAZINE, "Test", 1280));

		//groupingByメソッドの使用例
		Map<Boolean, List<Item>> map = list.stream().collect(Collectors.partitioningBy(
				item -> item.getPrice() > 1000));
		System.out.println(map);
	}

}
