package chapter2.section5.subsection2;

public class Outer {
	//フィールド
	int outerField;
	static int outerStaticField;
	
	//static付きメンバクラス
	static class Inner{
		void innerMethod() {
			//（コンパイルエラー）非staticフィールドは参照できない
			//outerField = 5;
			outerStaticField = 10;
		}
	}
	
	void outerMethod() {
		//外部クラスからはクラス名で利用可
		Inner ic = new Inner(); 
	}
}
