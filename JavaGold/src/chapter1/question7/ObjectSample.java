package chapter1.question7;

public class ObjectSample {

	public static void main(String[] args) {
		//Object obj = new Object() {
		//Object型で受け取ると、Object型にはtestメソッドがないとしてコンパイルエラーになる
		var obj = new Object() {
			public void test() {
				System.out.println("test");
			}
		};
		obj.test();
	}

}
