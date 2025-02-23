package chapter15.section12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 通常のクラスとしてロガーを設計すると、インスタンスが２つ生成され、ファイルを２重に開こうとしてしまう。
 * そこでSingletonパターンを用いて、ファイルの２重オープンを防ぐ。（※ファイルクローズ処理は入れているが）
 */
public class Mylogger {
	//唯一のインスタンス保存用
	private static Mylogger theInstance;
	//インスタンス取得メソッド
	public static Mylogger getInstance() {
		if(theInstance == null) {
			theInstance = new Mylogger();
		}
		return theInstance;
	}
	//ロガーメソッド
	public void log(String message) {
		String txtPath = "/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/dummylog.txt";
		try (FileWriter fw = new FileWriter(txtPath, true);
				BufferedWriter bw = new BufferedWriter(fw);) {
			// ファイルに引数の文字列を書き込む
			bw.write(message);
			bw.newLine();
			// 書き込みを即座に反映
			bw.flush();
			System.out.println("「" + message + "」をファイルに書き込みました ");
		} catch (IOException e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		}
	}
}
