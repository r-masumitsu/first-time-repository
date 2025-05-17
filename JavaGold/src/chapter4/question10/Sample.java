package chapter4.question10;

import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5);
		
		//従来のコレクションの使用方法
		for(Integer num : list) {
			System.out.println(num);
		}
		
		//ストリームAPIを使用したコード
		list.stream().forEach(System.out::println);
	}

}
