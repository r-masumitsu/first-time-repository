package chapter3.question1;

//SampleThreadのstartメソッドを実行するSampleクラス
public class Sample {

	public static void main(String[] args) {
		Thread t = new SampleThread();
		t.start();
		
		System.out.println("main");
	}

}
