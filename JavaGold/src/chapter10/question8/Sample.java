package chapter10.question8;

import java.io.FileReader;
import java.util.Properties;

//プロパティファイルの値を一覧表示
public class Sample {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileReader("db_settings.properties"));
		prop.list(System.out);
	}

}
