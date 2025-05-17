package chapter2.question12;

import java.util.function.UnaryOperator;

public class Sample {

	public static void main(String[] args) {
		UnaryOperator<Integer> increment = x -> ++x;
		UnaryOperator<Integer> twice = x -> x * 2;
		
		System.out.println(increment.apply(10));
		System.out.println(twice.apply(10));
		}
}
