package chapter2.question10;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		Function<Integer, Integer> plus = (x) -> x + 2;
		Function<Integer, Integer> times = (x) -> x * 2;
		
		//合成した新しいFunctionを生成
		Function<Integer, Integer> a = plus.andThen(times);
		Function<Integer, Integer> b = plus.andThen(plus);
		Function<Integer, Integer> c = plus.compose(times);
		Function<Integer, Integer> d = plus.compose(plus);
		
		//合成したFunctionのapplyメソッドを呼び出し
		System.out.println(a.apply(5));
		System.out.println(b.apply(5));
		System.out.println(c.apply(5));
		System.out.println(d.apply(5));
	}
}
