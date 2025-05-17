package chapter4.question28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		Stream<Integer> stream = list.stream();
		System.out.println(stream.count());
		
		/*
		 * 例外が発生
		 * Java の Stream は 一度しか使えない（消費済みになったら再利用できない） 
		 */
		stream.forEach(System.out::println);
	}

}
