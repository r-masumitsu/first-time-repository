package chapter7.section3.subsection2;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class GetPropertyMain {
	//プロパティファイルの読み取り
	public static void main(String[] args) {
		try (Reader fr = new FileReader(
				"/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/rpgdata.properties");) {
			Properties properties = new Properties();
			properties.load(fr); //ファイル内容を読み取る
			//キーを指定し値を取り出す
			String name = properties.getProperty("heroName");
			String strHp = properties.getProperty("heroHp");
			int hp = Integer.parseInt(strHp);
			System.out.println("勇者の名前：" + name);
			System.out.println("勇者のHP：" + hp);
		} catch (Exception e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		}
	}

}
