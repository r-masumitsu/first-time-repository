package chapter16;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

//Threadクラスを継承してrun()メソッドをオーバーライドする
//表示を行う別スレッドを定義
public class AtomicPrintingThread extends Thread{
	//スレッド中断の要請を管理するフィールド
	final AtomicBoolean stopReq = new AtomicBoolean(false);
	
	public void run() {
		for(int i = 9; i >= 0; i--) {
			if(this.stopReq.get()) {
				System.out.println("中断しました");
				break;	//中断要請が届いていたらループを抜けてrun()を終了する
			}
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