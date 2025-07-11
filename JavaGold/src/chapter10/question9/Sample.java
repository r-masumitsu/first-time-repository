package chapter10.question9;

import java.io.FileReader;
import java.util.Properties;

//プロパティファイルの値を一覧表示
public class Sample {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileReader("db_settings.properties"));
		
		//nameというキーの値を取り出してコンソールに表示
		System.out.println(prop.getProperty("name"));
	}

}
