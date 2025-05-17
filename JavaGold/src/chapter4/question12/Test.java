package chapter4.question12;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("E");
		set.add("D");
		set.add("C");
		set.add("B");
		set.add("A");
		Stream<String> stream = set.stream();
		
		//ハッシュコードで並び替えて表示される
		stream.forEach(System.out::println);
	}

}
