package chapter1.question7;

public class ThreadSample {
	public static void main(String[] args) {
		// {}内が実装部分だけを実装した匿名クラス
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		run.run();
	}
}
