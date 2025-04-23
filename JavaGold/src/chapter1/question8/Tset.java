package chapter1.question8;

public class Tset {

	public static void main(String[] args) {
		//newしているクラスそのものをインスタンス化しているわけではない。
		//Objectクラス継承した匿名のサブクラスのインスタンスを生成している。
		Object obj = new Object() {
			@Override
			public String toString() {
				return "hello.";
			}
		};
		System.out.println(obj.toString());
	}

}
