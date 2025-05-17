package chapter2.question5;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {
		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> bi = map::put;
		
		bi.accept("apple", 3);
		bi.accept("orange",2);
		
		System.out.println(map);

	}

}
