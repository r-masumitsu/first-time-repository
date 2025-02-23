package chapter2.section5.subsection4;

import chapter2.section2.Pocket;

public class AnonymousMain {

	public static void main(String[] args) {
		Pocket<Object> pocket = new Pocket<>();
		System.out.println("使い捨てのインスタンスを作りpocketに入れます");
		pocket.put(
			//メンバを２つ持つ匿名クラスを定義して宣言すると同時にインスタンス化
			new Object() {
				String innerField;
				void innerMethod() {};
			}
		);
	}

}
