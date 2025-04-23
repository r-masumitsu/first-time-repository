package chapter1.question4;

public class SampleOuter {
	private String message = "Hello, Java";

	class SampleInner {	//staticで修飾するとコンパイルエラーになる
		public void test() {
			System.out.println(message);
		}
	}
}
