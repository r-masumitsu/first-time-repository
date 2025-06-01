package chapter7.question14;

import java.util.HashMap;
import java.util.Map;

//Mapの使用例
public class Sample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		
		map.keySet().stream().forEach(key -> {
			System.out.println(map.get(key));
		});
	}

}
