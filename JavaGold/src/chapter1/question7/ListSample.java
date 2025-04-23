package chapter1.question7;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			Logger logger = System.getLogger("sample");

			@Override
			public boolean add(String value) {
				logger.log(Level.INFO, "ADD LOG:" + value);
				return super.add(value);
			}
		};
		list.add("A");
		list.add("B");
		list.add("C");
	}

}
