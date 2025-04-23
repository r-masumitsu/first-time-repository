package chapter1.question3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import chapter1.question3.Item.PriceComparator;

public class Main {

	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item[] {
						new Item("orange", 100),
						new Item("banana", 80),
						new Item("apple", 120)
				});
		//並び替え
		Collections.sort(items);
		for (Item item : items) {
			System.out.println(item.getName());
		}

		//PriceComparatorを使って並び替え
		Collections.sort(items, new PriceComparator());
		for (Item item : items) {
			System.out.println(item.getName());
		}
	}

}
