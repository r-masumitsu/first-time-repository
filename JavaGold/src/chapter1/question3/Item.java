package chapter1.question3;

import java.util.Comparator;

//PriceComparatorクラスをインナークラスに取り込んだItemクラス
public class Item implements Comparable<Item> {
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int compareTo(Item target) {
		return name.compareTo(target.name);
	}

	//値段で並び替えるPriceComparatorクラス
	public static class PriceComparator implements Comparator<Item> {

		@Override
		public int compare(Item a, Item b) {
			if (a.getPrice() < b.getPrice()) {
				return -1;
			}
			if (b.getPrice() < a.getPrice()) {
				return 1;
			}
			return 0;
		}

	}
}
