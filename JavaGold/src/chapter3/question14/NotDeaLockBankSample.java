package chapter3.question14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//デッドロックが発生しないクラス
public class NotDeaLockBankSample {

	public static void main(String[] args) throws Exception{
		//口座作成
		BankAccount a = new BankAccount("鈴木一朗", 100);
		BankAccount b = new BankAccount("松井秀喜", 100);

		//残高照会（スレッド実行前）
		System.out.println("残高照会（スレッド実行前）");
		System.out.println(a.toString() + "の残高は、" + a.getBalance() + "円");
		System.out.println(b.toString() + "の残高は、" + b.getBalance() + "円");

		/*
		 * 二つのスレッドでロックする順番が同じ
		 * デッドロック発生は発生しない
		 */
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(() -> {
			synchronized (a) {
				a.withdrawals(20);
				synchronized (b) {
					b.desposit(20);
				}
			}
		});
		exec.submit(() -> {
			synchronized (a) {
				a.withdrawals(30);
				synchronized (b) {
					b.desposit(30);
				}
			}
		});

		//残高照会（スレッド実行後）
		Thread.sleep(500);	//サブスレッドが終了するのを待つ
		System.out.println("残高照会（スレッド実行後）");
		System.out.println(a.toString() + "の残高は、" + a.getBalance() + "円");
		System.out.println(b.toString() + "の残高は、" + b.getBalance() + "円");

	}
}
