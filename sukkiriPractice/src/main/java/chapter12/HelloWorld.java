package main.java.chapter12;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(args[0]);
		list.add("world");
		
		try {
			if (args[0] == "hello") {
				throw new Exception();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("例外が発生しました");
		}
		for (Object s : list) {
			System.out.println(s);
		}
	}

}
