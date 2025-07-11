package chapter10.question11;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

//UTF-8のプロパティファイルをPropertiesオブジェクトで読み込み
public class SampleB {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new InputStreamReader(new FileInputStream("sample.properties"), "utf-8"));
		System.out.println(prop.getProperty("test"));
	}

}
