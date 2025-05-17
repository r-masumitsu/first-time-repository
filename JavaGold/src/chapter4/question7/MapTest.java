package chapter4.question7;

import java.util.Optional;

public class MapTest {

	public static void main(String[] args) {
		//getメソッドで値を取り出してから加工する方法
		Optional<String> sample = Optional.of("test");
		Optional<String> result = null;
		if (sample.isPresent()) {
			String str = sample.get();
			result = Optional.of(str.toUpperCase());
		}
		System.out.println(sample.get());
		System.out.println(result.get());

		/*
		 * mapメソッドを使えばよりシンプルに記述できる
		 * mapメソッドを使って処理を施した新しいOptionalインスタンスを生成できる
		 */
		result = sample.map(
				str -> str.toUpperCase());
		System.out.println(sample.get());
		System.out.println(result.get());
		
		//mapメソッド（空のOptionalの場合）
		sample = Optional.ofNullable(null);
		result = sample.map(
				str -> str.toUpperCase());
		System.out.println(result.isEmpty());
	}

}
