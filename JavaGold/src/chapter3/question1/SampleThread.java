package chapter3.question1;

//新しいスレッドクラスのSampleThread
public class SampleThread extends Thread {
	@Override
	public void run() {
		System.out.println("sub");
	}
}
