package chapter4.question24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chapter4.question23.Item;
import chapter4.question23.ItemType;

public class GroupingSample {

	public static void main(String[] args) {
		List<Item> list = Arrays.asList(
				new Item(1, ItemType.BOOK, "Java", 1980),
				new Item(2, ItemType.BOOK, "Lambda", 2980),
				new Item(3, ItemType.MAGAZINE, "Software", 980),
				new Item(4, ItemType.MAGAZINE, "Test", 1280));

		//groupingByメソッドの使用例
		Map<ItemType, List<Item>> group = list.stream().collect(Collectors.groupingBy(
				Item::getType));
		System.out.println(group);
	}

}
