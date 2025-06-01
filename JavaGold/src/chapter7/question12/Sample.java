package chapter7.question12;

import java.util.ArrayDeque;
import java.util.Deque;

//Dequeの使用例
public class Sample {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>(5);
		deque.addLast("A");
		deque.addLast("B");
		deque.addFirst("C");
		deque.addFirst("D");
		
		deque.stream().forEach(System.out::println);
	}
}
