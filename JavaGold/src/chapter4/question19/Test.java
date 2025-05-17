package chapter4.question19;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//引数一つのreduceメソッドの戻り値はOptional<T>型
		Optional<Integer> result = list.stream().reduce((a,b) -> a + b);
		
		result.ifPresent(System.out::println);
		
	}

}
