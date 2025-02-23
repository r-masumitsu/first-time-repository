package chapter16;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

//Threadクラスを継承してrun()メソッドをオーバーライドする
//表示を行う別スレッドを定義
public class CountUpThread extends Thread{
	//スレッド中断の要請を管理するフィールド
	final AtomicBoolean stopReq = new AtomicBoolean(false);
	
	public void run() {
		for(int i = 0; i <= 50; i++) {
			System.out.println("カウントアップ：" + i);
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch (InterruptedException e) {
				System.out.println("InterruptedExceptionをキャッチしました");
				e.printStackTrace();
			}
		}
	}
}