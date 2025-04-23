package chapter1.question3;

public class Outer {
	public static class Inner{
		//staticインナークラスは、エンクロージングクラスのインスタンスがなくてもインスタンス化できる。
		Inner inner = new Inner();
	}
}
