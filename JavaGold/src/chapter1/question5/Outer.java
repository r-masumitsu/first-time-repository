package chapter1.question5;

public class Outer {
	void test() {
		Inner.message = "Hello, Java";
	}

	static class Inner {
		private static String message;

		public void test() {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {
		new Outer().test();
		new Inner().test();

	}

}
