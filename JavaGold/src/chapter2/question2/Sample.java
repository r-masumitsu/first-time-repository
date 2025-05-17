package chapter2.question2;

public class Sample {

	public static void main(String[] args) {
		Test test = new Test();
		test.execute(() -> new B());
	}

}
