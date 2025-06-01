package chapter7.question17;

import java.util.Arrays;
import java.util.List;

import chapter7.question16.Item;

public class Sample {

	public static void main(String[] args) {
		Item a = new Item("apple", 100);
		Item b = new Item("orange", 120);
		Item c = new Item("banana", 80);
		
		List<Item> list = Arrays.asList(a,b,c);
		
		//並び替え実行
		list.sort(new ItemNameComparator());
		list.forEach(System.out::println);
		
		//ItemNameComparatorを使用せずに、ラムダ式を使う方法
		System.out.println("以下、名前の逆順");
		//並び替え実行
		list.sort((o1,o2) -> {
			return -(o1.getName().compareTo(o2.getName()));
		});
		list.forEach(System.out::println);
	}
}
