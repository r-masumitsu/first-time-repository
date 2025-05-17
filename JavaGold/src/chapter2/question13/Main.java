package chapter2.question13;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		/*
		 * UnaryOperatorで一律処理
		 * replaceAllメソッドがUnaryOperator型の引数を受け取り、リストのすべての要素をラムダ式の実行結果で置き換える。
		 */
		list.replaceAll(x -> x.toUpperCase());
		for(String str : list) {
			System.out.println(str);
		}
	}

}
