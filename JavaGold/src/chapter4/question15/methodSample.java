package chapter4.question15;

import java.util.Arrays;
import java.util.List;

public class methodSample {

	public static void main(String[] args) {
		
		//distinctメソッド
		List<String> strList = Arrays.asList("A","B","C","A");
		strList.stream()
			.distinct()	//重複を取り除く
			.forEach(System.out::println);
		
		//limitメソッド
		List<Integer> IntegerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		IntegerList.stream()
			.limit(5)	//先頭から数えて5つだけ採用
			.skip(2)	//先頭から2つをスキップする
			.forEach(System.out::println);
	}

}
