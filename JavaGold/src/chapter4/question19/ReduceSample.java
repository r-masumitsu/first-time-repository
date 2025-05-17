package chapter4.question19;

import java.util.Arrays;
import java.util.List;

//計算の経過を確認できるようにしたコード
public class ReduceSample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		//引数二つのreduceメソッドの戻り値は第一引数の型
		Integer result = list.stream().reduce(100, (a,b) -> {
			int c = a + b;
			System.out.print("a = " + a);
			System.out.print(", b = " + b);
			System.out.println(", a + b = " + c);
			return c;
		});
		System.out.println(result);
		
	}


}
