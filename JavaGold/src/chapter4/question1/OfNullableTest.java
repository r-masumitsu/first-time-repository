package chapter4.question1;

import java.util.Optional;

public class OfNullableTest {

	public static void main(String[] args) {
		Optional<String> ofNullablesample = Optional.ofNullable(null);
		System.out.println(ofNullablesample);
	}

}
