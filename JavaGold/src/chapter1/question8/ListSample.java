package chapter1.question8;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			{
				super.add("A");
				super.add("B");
				super.add("C");
			}
		};
		for(String str : list) {
			System.out.println(str);
		}
	}

}
