package chapter7.question6;

import java.util.Collection;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<Integer> a = List.of(1,2,3,4,5);
		List<String> b = List.of("A","B","C"); 
		
		printAll(a);
		printAll(b);
	}
	
	private static void printAll(Collection<?> collection) {
		collection.stream().forEach(System.out::println);
	}
}
