package chapter4.question13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C","D","E");
		Stream<String> stream = list.parallelStream();
		
		//複数のスレッドが起動し、一斉にストリームを処理しているため、順番を制御できない。
		stream.forEach(System.out::println);
		
		//ストリームの処理順を維持したいときはforEachOrderedを使う（パフォーマンスは下がる）
		stream.forEachOrdered(System.out::println);
	}

}
