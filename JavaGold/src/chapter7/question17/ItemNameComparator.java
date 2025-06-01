package chapter7.question17;

import java.util.Comparator;

import chapter7.question16.Item;

public class ItemNameComparator implements Comparator<Item> {

	@Override
	public int compare(Item a, Item b) {
		return a.getName().compareTo(b.getName());
	}

}
