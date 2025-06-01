package chapter7.question16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		Item a = new Item("apple", 100);
		Item b = new Item("orange", 120);
		Item c = new Item("banana", 80);
		
		List<Item> list = Arrays.asList(a,b,c);
		
		//並び替え実行
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}
