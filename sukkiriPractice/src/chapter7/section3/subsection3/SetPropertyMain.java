package chapter7.section3.subsection3;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class SetPropertyMain {
	//プロパティファイルへの書き込み
	public static void main(String[] args) {
		try (Writer fw = new FileWriter(
				"/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/rpgsave.properties");) {
			Properties properties = new Properties();
			//データのセット
			properties.setProperty("heroName", "アサカ");
			properties.setProperty("heroHP", "62");
			properties.setProperty("heroMp", "45");
			//ファイルへ書き出す
			//「勇者の情報」はファイルの先頭にコメントとして出力される
			//Propertiesクラスはデフォルトで文字列をUnicodeエスケープ形式で保存する
			properties.store(fw, "勇者の情報");
		} catch (Exception e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		}
	}
}
