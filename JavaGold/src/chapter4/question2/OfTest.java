package chapter4.question2;

import java.util.Optional;

public class OfTest {

	public static void main(String[] args) {
		Optional<String> sample = Optional.ofNullable(null);
		System.out.println(sample.get());
	}

}
