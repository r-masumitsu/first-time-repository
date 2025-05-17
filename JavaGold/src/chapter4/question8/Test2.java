package chapter4.question8;

import java.util.Optional;

public class Test2 {

	public static void main(String[] args) {
		Optional<Integer> a = Optional.of(100);
		
		//calcメソッドの戻り値の型はOptional<Integer>型なのでコンパイルエラーになる
		//Optional<Integer> b = a.map(price -> calc(price, 3));
		
		Optional<Optional<Integer>> b = a.map(price -> calc(price, 3));
		System.out.println(b.get());
	}

	private static Optional<Integer> calc(int price, int qty){
		if(qty < 0) {
			return Optional.empty();
		}
		return Optional.of(price * qty);
	}
}
