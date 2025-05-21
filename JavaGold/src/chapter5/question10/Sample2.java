package chapter5.question10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Sample2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("sample.ser");
		ObjectInputStream in = new ObjectInputStream(fis);
		try (in) {
			Object obj = in.readObject();
			Item item = (Item)obj;
			System.out.println(item);
		}
	}

}
