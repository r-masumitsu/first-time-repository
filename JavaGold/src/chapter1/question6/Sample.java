package chapter1.question6;

public class Sample {
	private String message;
	public Test test(String value) {
		class A implements Test{
			@Override
			public void execute() {
				System.out.println(message + value);
			}
		}
		//ローカルクラスから参照するローカル変数は、実質的finalでなければならない。
		//value = "LocalClass";
		message = "Hello, ";
		return new A();
	}
}
