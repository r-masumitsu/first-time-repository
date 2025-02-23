package chapter3.section2.subsection2;

import java.util.function.Function;

//変数へのメソッド参照の格納を行うクラス
public class MethodReferenceMain {
	public static Integer len(String s) {
		return s.length();
	}
	public static void main(String[] args) {
		 //lenメソッドの処理ロジックを、変数funcに代入する
		Function<String, Integer> func = MethodReferenceMain::len;
		//変数funcに格納されている処理ロジックを、引数"Java"で実行する
		int a = func.apply("Java");
		System.out.println("文字列「Java」は" + a + "文字列です");
	}

}
