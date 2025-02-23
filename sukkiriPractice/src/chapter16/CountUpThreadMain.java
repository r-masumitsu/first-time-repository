package chapter16;

public class CountUpThreadMain {

	public static void main(String[] args) {
		System.out.println("カウントアップを開始します");
		CountUpThread thread1 = new CountUpThread();
		CountUpThread thread2 = new CountUpThread();
		CountUpThread thread3 = new CountUpThread();
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
