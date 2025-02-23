package chapter7.section9;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class MainGetProperty {
	//プロパティファイルの読み取り
	public static void main(String[] args) {
		try (Reader fr = new FileReader(
				"/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/pref.properties");) {
			Properties properties = new Properties();
			properties.load(fr); //ファイル内容を読み取る
			//キーを指定し値を取り出す
			String capital = properties.getProperty("aichi.capital");
			String food = properties.getProperty("aichi.food");
			System.out.println(capital + "：" + food);
		} catch (Exception e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		}
	}

}
