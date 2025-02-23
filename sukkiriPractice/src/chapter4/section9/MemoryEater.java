package chapter4.section9;

import java.util.Locale;

//起動すると要素数1280000のlong型配列を確保するだけの処理を行うプログラム
public class MemoryEater {

	public static void main(String[] args) {
		//MemoryEater（自身）に関する情報を取得して表示する
		Class<?> info = MemoryEater.class;
		System.out.println(info.getName());	//→chapter4.section9.MemoryEater
		
		//要素数1280000のlong型配列を確保
		long[] ary = new long[1280000];
		
		Locale loc = Locale.getDefault();	//デフォルトロケールを取得
		String Language = loc.getLanguage();	//ロケールの言語コードを取得
		
		if(Language.equals("ja")) {
			System.out.println("メモリを消費しています・・・");
		}else {
			System.out.println("eating memory...");
		}
	}

}
