package chapter4.question2;

import java.util.NoSuchElementException;
import java.util.Optional;

public class GetTest {

	public static void main(String[] args) {
		//getメソッドの使用例
		Optional<String> sample1 = Optional.of("Hello");
		System.out.println(sample1.get());
		
		//isPresentメソッドの使用例
		Optional<String> sample3 = Optional.empty();
		if(sample3.isPresent()) {
			System.out.println(sample1.get());
		}else {
			System.out.println("empty");
		}
		
		//isEmptyメソッドの使用例
		Optional<String> sample4 = Optional.empty();
		if(sample4.isEmpty()) {
			System.out.println("empty");
		}else {
			System.out.println(sample4.get());	
		}
		
		/*
		 * getメソッドで空のOptionalから値を取り出す
		 * 例外が発生する
		 */
		Optional<String> sample2 = Optional.empty();
		try {
			System.out.println(sample2.get());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

}
