package chapter2.question3;

import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("Hello, Lambda");
	}
}
