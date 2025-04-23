package chapter1.question9;

public class D implements A {

	public static void main(String[] args) {
		A.test();
		/*
		 * Aインタフェースに定義したstaticメソッドは、A.test()でしか呼び出せない
		 */
		//B.test();
		//C.test();
		//test();
	}

}
