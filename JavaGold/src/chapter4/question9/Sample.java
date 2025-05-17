package chapter4.question9;

import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5);
		
		//拡張for文を使った要素の取り出し
		for(Integer num : list) {
			System.out.println(num);
		}
		
		//forEachメソッドを使った要素の取り出し
		list.forEach(x -> System.out.println(x));
		
		//forEachメソッドを使った要素の取り出し（メソッド参照）
		list.forEach(System.out::println);
	}

}
