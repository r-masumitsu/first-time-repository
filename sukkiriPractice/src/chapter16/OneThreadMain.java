package chapter16;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//（スレッド一つでは）カウントダウン中はできないことを確かめるクラス
public class OneThreadMain {
	public static void main(String[] args) {
		System.out.println("止めるには「STOP」を入力してください");
		System.out.println("カウントダウンを開始します");
		for(int i = 9; i >= 0; i--) {
			System.out.print(i + "..");
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch (InterruptedException e) {
				System.out.println("InterruptedExceptionをキャッチしました");
				e.printStackTrace();
			}
		}
		@SuppressWarnings("resource")	//警告が出ないようにした
		String input = new Scanner(System.in).nextLine();
		System.out.println("入力文字列：" + input);
	}
}
