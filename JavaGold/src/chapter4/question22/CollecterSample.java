package chapter4.question22;

import java.util.Arrays;
import java.util.List;

//collectメソッドを使うように修正
public class CollecterSample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		String result = list.parallelStream().collect(new SampleCollector());
		System.out.println(result);
	}

}
