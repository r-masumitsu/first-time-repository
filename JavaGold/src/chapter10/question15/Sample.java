package chapter10.question15;

import java.util.Locale;
import java.util.ResourceBundle;

public class Sample {

	public static void main(String[] args) {
		//クラスパスを確認してみた
		System.out.println(System.getProperty("java.class.path"));
		
		//任意のタイミングでロケール情報を切り替えるには、getBundleメソッドの第2引数にロケール情報渡す。
		ResourceBundle jp = ResourceBundle.getBundle("sample", Locale.JAPAN);
		ResourceBundle us = ResourceBundle.getBundle("sample",Locale.US);
		System.out.println(jp.getString("test"));
		System.out.println(us.getString("test"));
	}

}
