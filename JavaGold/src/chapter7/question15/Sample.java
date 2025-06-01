package chapter7.question15;

import java.util.HashMap;
import java.util.Map;

//Map.Entryの使用例
public class Sample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);

		map.entrySet()
				.stream()
				.forEach((Map.Entry<String, Integer> entry) -> {
					String key = entry.getKey();
					Integer val = entry.getValue();
					System.out.println(key + ":" + val);
				});
	}

}
