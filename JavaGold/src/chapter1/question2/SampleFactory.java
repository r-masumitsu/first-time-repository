package chapter1.question2;

public class SampleFactory {
	public static Sample create() {
		return new SampleFactory().new SampleImpl();
	}
	
	//SampleImplクラスのtestメソッドを使う
	public static void test() {
		new SampleFactory().new SampleImpl().test();
	}
	
	private class SampleImpl implements Sample{
		public void test() {
			System.out.println("test");
		}
		@Override
		public void execute() {
			System.out.println("execute");
		}
	}
}
