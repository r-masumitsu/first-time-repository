package chapter4.question7;

import java.util.Optional;

public class Ex7 {

	public static void main(String[] args) {
		Optional<String> sample = Optional.of("abcde");
		Optional<String> result = sample.map(str -> str.toUpperCase());
		
		System.out.println(sample.get());
		System.out.println(result.get());
	}

}
