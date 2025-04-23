package chapter1.question2;

public class Outer {

	class Inner {
		public void test() {
			System.out.println("test");
		}
	}

	public static void main(String[] args) {
		new Outer().new Inner();
	}

}
