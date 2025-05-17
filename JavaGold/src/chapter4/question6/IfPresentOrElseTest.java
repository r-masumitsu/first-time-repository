package chapter4.question6;

import java.util.Optional;

public class IfPresentOrElseTest {

	public static void main(String[] args) {
		Optional<String> sample = Optional.empty();
		sample.ifPresentOrElse(
			(str) -> System.out.println(str),	//値がある場合の処理
			 () -> System.out.println("empty")	//値がない場合の処理
		);
	}

}
