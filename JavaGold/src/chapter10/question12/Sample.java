package chapter10.question12;

import java.util.ResourceBundle;

public class Sample {

	public static void main(String[] args) {
		//クラスパスを確認してみた
		System.out.println(System.getProperty("java.class.path"));
		
		/*
		 * クラスパス（Applications/Eclipse_2023-12.app/Contents/workspace/JavaGold）を追加しないと、MissingResourceExceptionが発生した。
		 * 「ビルドパスの構成」の「ライブラリ」タブから設定
		 * getBundleメソッドは、クラスパス上にある .properties または .class ファイルを、パッケージ名（ドット区切り）で指定する仕様
		 * Eclipse では、プロジェクトのビルド出力ディレクトリ（通常は bin/）を自動的にクラスパスに追加してくれる仕組みになっている。
		 */
		//プロパティファイルの、ファイル名から拡張子を除いたもの（基底名）を指定
		ResourceBundle resource = ResourceBundle.getBundle("sample");
		System.out.println(resource.getString("test"));
	}

}
