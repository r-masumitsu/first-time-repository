package chapter16;

import java.util.concurrent.TimeUnit;

//Threadクラスを継承してrun()メソッドをオーバーライドする
//表示を行う別スレッドを定義
public class PrintingThread extends Thread{
	public void run() {
		for(int i = 9; i >= 0; i--) {
			System.out.println(i + "..");
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch (InterruptedException e) {
				System.out.println("InterruptedExceptionをキャッチしました");
				e.printStackTrace();
			}
		}
	}
}
