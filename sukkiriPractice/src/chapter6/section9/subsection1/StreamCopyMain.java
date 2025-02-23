package chapter6.section9.subsection1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStreamクラスとFileOutputStreamクラスを使ってファイルをコピーするプログラム
public class StreamCopyMain {

	public static void main(String[] args) {
		//起動パラメータからパスを取得
		String sourcePath = args[0];
		String targetPath = args[1];

		//（FileOutputStreamにて）第２引数がfalseまたは省略の場合、必ずファイルの先頭からデータを上書きしていく
		try (FileInputStream fis = new FileInputStream(sourcePath);
				FileOutputStream fos = new FileOutputStream(targetPath);) {
			int i = fis.read(); //１バイト読む
			while (i != -1) {
				fos.write(i); //１バイト書く
				i = fis.read(); //これ以上読めるデータがない時は-1を返す
			}
			fos.flush(); // 書き込みを反映
			System.out.println("ファイルの読み込みと書き込みが終わりました");
		} catch (IOException e) {
			System.out.println("入出力例外が発生しました。");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("例外が発生しました。");
			e.printStackTrace();
		}
	}
}
