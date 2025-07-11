package chapter10.question7;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

//プロパティファイルの読み込み
public class Sample {

	public static void main(String[] args) throws Exception {
		//インスタンスを生成して、プロパティファイルを読み込み
		Properties prop = new Properties();
		prop.load(new FileReader("db_settings.properties"));
		
		//キーの一覧の取り出して、キーに一致する値をコンソールに表示
		Set<Object> keys = prop.keySet();
		for(Object key : keys) {
			System.out.println(prop.get(key));
		}
		
		//プロパティファイルの全ての値を一覧表示
		prop.forEach((k, v) -> System.out.println(k + "=" + v));
	}

}
