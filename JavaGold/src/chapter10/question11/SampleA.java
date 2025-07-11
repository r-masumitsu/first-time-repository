package chapter10.question11;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Properties;

//UTF-8のプロパティファイルをPropertiesオブジェクトで読み込み
public class SampleA {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileReader("sample.properties", Charset.forName("UTF-8")));
		System.out.println(prop.getProperty("test"));
	}

}
