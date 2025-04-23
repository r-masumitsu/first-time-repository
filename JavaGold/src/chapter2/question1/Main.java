package chapter2.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		Supplier<List<String>> supplier = () -> new ArrayList<String>();
		List<String> list = supplier.get();
		
		list.add("Kenny");
		for(String str : list) {
			System.out.println(str);
		}
	}

}
