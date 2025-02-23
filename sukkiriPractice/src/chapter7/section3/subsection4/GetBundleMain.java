package chapter7.section3.subsection4;

import java.util.ResourceBundle;

public class GetBundleMain {

	public static void main(String[] args) {
		//クラスパスを起点としたパスを指示。末尾に「properties」は記述しない。
		ResourceBundle rb = ResourceBundle.getBundle("rpgdata");
		String heroName = rb.getString("heroName");
		System.out.println("勇者の名前：" + heroName);
	}

}
