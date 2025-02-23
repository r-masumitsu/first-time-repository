package chapter6.section5.subsection2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BaosMain {

	public static void main(String[] args) {
		// コンソールで確認するために例外時の処理を書いた

		try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			baos.write(65);
			baos.write(66);
			byte[] data = baos.toByteArray();
			for (byte b : data) {
				char c = (char)b;	//文字にキャストしてみた
				System.out.println(c);
			}
		} catch (IOException e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		}
	}

}
