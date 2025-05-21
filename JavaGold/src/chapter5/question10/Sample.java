package chapter5.question10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Sample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("sample.ser");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		try (out) {
			Item item = new Item("apple", 100);
			out.writeObject(item);	//シリアライズされてファイルに出力される
		}
	}

}
