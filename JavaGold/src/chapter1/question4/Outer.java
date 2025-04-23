package chapter1.question4;

public class Outer {
	private int num = 2;
	public void hoge() {
		Inner test = new Inner();
		test.data = 100;
		test.execute();
		System.out.println(num);
	}
	private static class Inner{
		private int data;
		void execute() {
			//System.out.println(num * data);
			//↑非staticなメンバにはアクセスできないのでコンパイルエラー
			System.out.println(data);
		}
	}
}
