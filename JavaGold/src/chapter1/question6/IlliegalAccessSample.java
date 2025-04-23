package chapter1.question6;

public class IlliegalAccessSample {
	public void test() {
		String name = "sample";
		class Sample{
			public void hello() {
				System.out.println("Hello, " + name);
			}
		}
		//ローカルクラス内から参照するローカル変数は、実質的finalでなければならない。
		//name = "test";
		new Sample().hello();
	}
}
