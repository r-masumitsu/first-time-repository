package chapter7.section9;

import java.util.ResourceBundle;

public class GetBundleMain {

	public static void main(String[] args) {
		//クラスパスを起点としたパスを指示。末尾に「properties」は記述しない。
		ResourceBundle rb = ResourceBundle.getBundle("pref");
		String capital = rb.getString("aichi.capital");
		String food = rb.getString("aichi.food");
		System.out.println(capital + "：" + food);
	}
}
