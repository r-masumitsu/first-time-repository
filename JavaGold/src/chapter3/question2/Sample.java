package chapter3.question2;

public class Sample {

	public static void main(String[] args) {
		//Runnableを実現したクラスを、Threadのコンストラクタに渡してスレッドを作る。
		//		Thread t = new Thread(new Runnable() {
		//			@Override
		//			public void run() {
		//				System.out.println("sub");
		//			}
		//		}) ;

		//Threadのコンストラクタの引数をラムダ式で表現する
		Thread t = new Thread(() -> {
			System.out.println("sub");
		});

		t.start();

		System.out.println("main");
	}

}
